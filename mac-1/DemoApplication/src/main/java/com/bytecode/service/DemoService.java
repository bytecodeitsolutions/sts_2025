package com.bytecode.service;

import com.bytecode.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public void process() {
        System.out.println("Service: Processing request");
        demoRepository.getData();
    }
}
