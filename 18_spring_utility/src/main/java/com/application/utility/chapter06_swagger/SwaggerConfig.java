package com.application.utility.chapter06_swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	
	@Bean
    public OpenAPI customOpenAPI() {
    	
        return new OpenAPI()
                .info(new Info()
                .title("title : swagger실습")
                .description("Your API Description : 문서화 실습")
                .version("version 입력 : 1.0"));
        
    }
	
	
}
