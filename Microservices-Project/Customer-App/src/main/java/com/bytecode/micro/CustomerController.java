package com.bytecode.micro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customers/{id}")
    public String getCustomer(@PathVariable int id) {
        // Simple static data
        return "Customer with ID: " + id + " -> Name: John Doe"; 
    }
}
