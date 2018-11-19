package com.hibernate.test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description
 * @Author LANRY
 * @Date 2018-11-19 13:39
 * @Company www.midea.com
 */
@SpringBootApplication(scanBasePackages = {"com.hibernate.test.controller"
        , "com.hibernate.test.service"
        , "com.hibernate.test.configuration"
        , "com.hibernate.test.model"})
@EnableJpaRepositories
@EnableSwagger2
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket useApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(path -> path.startsWith("/api/"))
                .build();
    }
}
