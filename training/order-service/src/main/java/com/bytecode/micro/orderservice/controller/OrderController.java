package com.bytecode.micro.orderservice.controller;

import com.bytecode.micro.orderservice.service.OrderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final RestTemplate restTemplate;

    public OrderController(OrderService orderService, RestTemplate restTemplate) {
        this.orderService = orderService;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/customers")
    public List<Map<String, Object>> getAllCustomersWithOrders() {

        String url = "http://localhost:8081/api/customers"; // <-- working URL
        List<Map<String, Object>> customers = restTemplate.getForObject(url, List.class);

        for (Map<String, Object> customer : customers) {
            int customerId = (Integer) customer.get("id");

            var orders = orderService.getOrdersByCustomerId(customerId);
            customer.put("orders", orders); // add orders to customer
        }

        return customers;
    }


}
