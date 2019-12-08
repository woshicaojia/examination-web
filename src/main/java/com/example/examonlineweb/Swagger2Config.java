package com.example.examonlineweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author caojia
 * @time 下午 3:43
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).
                apiInfo(apiInfo()).
                select().
                apis(RequestHandlerSelectors.basePackage("com.example.examonlineweb.controller")).
                paths(PathSelectors.any()).
                build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().
                title("前后端分离项目中使用swagger2构建restful api").
                description("第一次在springboot项目中集成swagger2").
                contact("xxxxxx").
                version("1.0").build();
    }
}
