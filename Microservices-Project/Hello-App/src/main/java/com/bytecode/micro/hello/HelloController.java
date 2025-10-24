package com.bytecode.micro.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello/{id}")
    public String sayHello(@PathVariable int id) {
        // Call customer-service running on localhost:8081
        String customer = restTemplate.getForObject(
            "http://localhost:8081/customers/" + id, String.class);
        return "Hello! Customer info: " + customer;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
