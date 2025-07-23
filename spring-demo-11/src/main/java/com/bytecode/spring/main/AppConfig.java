package com.bytecode.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

 
    // Factory Bean Instance
	/*
	 * @Bean public BikeFactory bikeFactory() { return new BikeFactory(); }
	 */

    // Non-static Factory Method
    @Bean
    public Bike bike1() {
        return BikeFactory.buildBike();
    }
}
