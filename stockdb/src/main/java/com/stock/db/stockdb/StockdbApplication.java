package com.stock.db.stockdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
class StockdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockdbApplication.class, args);
	}
}
