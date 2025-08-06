package com.bytecode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bytecode.bean.Car;

@Configuration
public class AppConfig {
    
	@Bean
	public Car car() {
		return new Car();
	}
}
