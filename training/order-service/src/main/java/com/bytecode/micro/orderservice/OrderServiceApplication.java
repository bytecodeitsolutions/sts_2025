package com.bytecode.micro.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
		  System.out.println("✅ Order Service running on 8082");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
