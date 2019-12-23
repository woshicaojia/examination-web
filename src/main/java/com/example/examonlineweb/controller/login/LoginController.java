package com.example.examonlineweb.controller.login;

import com.example.examonlineweb.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/main")
    public String shiroLogin(@RequestParam("userName")String userName,
                             @RequestParam("userPass")String userPass,
                             @RequestParam(name = "rememberMe",required = false)Integer rememberMe, HttpServletRequest request, HttpServletResponse response)throws Exception {
        UsernamePasswordToken token = new UsernamePasswordToken(userName, userPass);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token);
        Map<String, String> respMap = new HashMap<>();
        if (subject.isAuthenticated()) {//登录成功
            if (rememberMe != null && rememberMe == 1) {
                token.setRememberMe(true);
            }
            //获取当前登录用户对象
            User user = (User) subject.getPrincipal();
            request.getSession().setAttribute("custom", user);
            //通过identify查询用户信息，将用户信息存放到session中
            if (user.getIdentify().length() == 8) {//学生编号
//                Student student = studentService.findByStudentId(user.getIdentify());
//                request.getSession().setAttribute("user",student);
            } else if (user.getIdentify().length() == 9) {
//                Teacher teacher = teacherService.findByTeacherId(user.getIdentify());
//                request.getSession().setAttribute("user",teacher);
            }
            return "main";
        } else {//登录失败
            token.clear();
            respMap.put("msg", "登录失败，请重新登录！");
        }
        if (!CollectionUtils.isEmpty(respMap)) {
            response.setContentType("text/html;charset=utf-8");
            String msg = "alert('" + respMap.get("msg") + "'); window.location.href='" + request.getContextPath() + "/login';";
            response.getWriter().write("<script language=\"javascript\">");
            response.getWriter().write(msg + "\n");
            response.getWriter().write("</script>");
            return null;
        }
        return "redirect:/login";
    }

    //退出登录
    @RequestMapping("/logout")
    public String logout() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            subject.logout();
        }
        return "login";
    }
}
