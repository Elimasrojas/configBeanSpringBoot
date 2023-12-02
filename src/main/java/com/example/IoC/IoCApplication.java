package com.example.IoC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IoCApplication {

	public static void main(String[] args) {
		SpringApplication.run(IoCApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/IoC/dos/aplicationContext2.xml");
	}

}
