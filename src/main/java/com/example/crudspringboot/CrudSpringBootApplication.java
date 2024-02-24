package com.example.crudspringboot;

import com.example.crudspringboot.Strategy.CustomNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.crudspringboot")
@EntityScan(basePackages = "com.example.crudspringboot.Models")

public class CrudSpringBootApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CrudSpringBootApplication.class, args);

        openBrowser("http://localhost:8080/swagger-ui/index.html");
    }

    private static void openBrowser(String url){
        System.out.println("Swagger UI is available at: " + url);
    }

    @Bean
    public PhysicalNamingStrategy physicalNamingStrategy() {
        return new CustomNamingStrategy();
    }


}
