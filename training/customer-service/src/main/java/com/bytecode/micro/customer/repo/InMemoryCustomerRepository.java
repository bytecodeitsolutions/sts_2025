package com.bytecode.micro.customer.repo;

import com.bytecode.micro.customer.model.Customer;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class InMemoryCustomerRepository {

    private final Map<Long, Customer> store = new ConcurrentHashMap<>();
    private final AtomicLong idGen = new AtomicLong(100);

    @PostConstruct
    public void init() {
        save(new Customer(null, "Aman Kumar", "aman@example.com"));
        save(new Customer(null, "Priya Singh", "priya@example.com"));
    }

    public Customer save(Customer c) {
        if (c.getId() == null) {
            c.setId(idGen.getAndIncrement());
        }
        store.put(c.getId(), c);
        return c;
    }

    public Customer findById(Long id) {
        return store.get(id);
    }

    public Collection<Customer> findAll() {
        return store.values();
    }

    public void deleteById(Long id) {
        store.remove(id);
    }
}
