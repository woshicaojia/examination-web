package com.example.examonlineweb.config;

import com.example.examonlineweb.intercept.MyIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * 自定义配置文件
 * @author caojia
 * @createtime 2019-11-04 17:17
 */
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
    @Autowired
    private MyIntercept myIntercept;

    /**
     * 自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(myIntercept).addPathPatterns("/**").
                excludePathPatterns("/","/login","/main","/css/**", "/fonts/**","/images/**","/img/**", "/js/**", "/plugins/**");
    }

    /**
     * 自定义默认请求
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("login");
    }
}
