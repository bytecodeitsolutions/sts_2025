package com.bytecode.repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {

    public void getData() {
        System.out.println("Repository: Fetching data (dummy)");
    }
}
