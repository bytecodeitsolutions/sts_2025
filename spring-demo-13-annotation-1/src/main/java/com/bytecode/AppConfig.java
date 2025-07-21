package com.bytecode;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bytecode","com.bytecode1"})
public class AppConfig {

}
