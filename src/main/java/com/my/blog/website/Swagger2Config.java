package com.my.blog.website;

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
 * @author Hlingoes
 * @date 2018年3月25日下午9:51:06
 * @citation SpringBoot整合Swagger2 https://www.cnblogs.com/jtlgb/p/8532433.html
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	
	//swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.my.blog.website.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("springboot利用swagger构建api文档")
				.description("简单优雅的restfull风格，http://blog.csdn.net/saytime")
				.termsOfServiceUrl("http://www.github.com/kongchen/swagger-maven-plugin")
				.version("1.0")
				.build();
    }
 
}