package com.m2ilyon.ndiaye.mongoapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SpringfoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo())
                ;
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Ndiaye D.", "https://linkedin.com/in/sdssd893e2", "ndiaye.diabira@m2i.com");
        return new ApiInfo(
                "M2I User Management API - MongoDB",
                "Simple CRUD API for user management using MongoDB",
                "1.0",
                "https://www.m2i.com",
                contact,
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
