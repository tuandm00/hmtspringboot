package com.example.crudspringboot;

import com.example.crudspringboot.Controller.UserController;
import com.example.crudspringboot.Strategy.CustomNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example.crudspringboot")
@EntityScan(basePackages = "com.example.crudspringboot.Models")

public class CrudSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringBootApplication.class, args);
    }

    @Bean
    public PhysicalNamingStrategy physicalNamingStrategy() {
        return new CustomNamingStrategy();
    }

}
