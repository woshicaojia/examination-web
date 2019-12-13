package com.example.examonlineweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.example.examonlineweb.dao")
@EnableSwagger2
public class ExamOnlineWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamOnlineWebApplication.class, args);
    }

}
