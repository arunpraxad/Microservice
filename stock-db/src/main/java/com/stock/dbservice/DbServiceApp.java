package com.stock.dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "repository")
@SpringBootApplication
public class DbServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(DbServiceApp.class, args);
    }
}
