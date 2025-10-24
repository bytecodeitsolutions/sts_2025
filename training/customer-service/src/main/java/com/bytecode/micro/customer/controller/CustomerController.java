package com.bytecode.micro.customer.controller;

import com.bytecode.micro.customer.model.Customer;
import com.bytecode.micro.customer.repo.InMemoryCustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Collection;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final InMemoryCustomerRepository repo;

    public CustomerController(InMemoryCustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public Collection<Customer> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(@PathVariable Long id) {
        Customer c = repo.findById(id);
        return (c == null)
                ? ResponseEntity.notFound().build()
                : ResponseEntity.ok(c);
    }

    @PostMapping
    public ResponseEntity<Customer> create(@RequestBody Customer customer) {
        Customer saved = repo.save(customer);
        return ResponseEntity.created(URI.create("/api/customers/" + saved.getId())).body(saved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
