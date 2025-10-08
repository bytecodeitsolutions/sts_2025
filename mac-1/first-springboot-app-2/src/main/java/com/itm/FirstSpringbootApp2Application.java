package com.itm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstSpringbootApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext appletContext=SpringApplication.run(FirstSpringbootApp2Application.class, args);
	    System.out.println("hello spring boot");
	    Car car=appletContext.getBean("car",Car.class);
	    car.move();
	}

}
