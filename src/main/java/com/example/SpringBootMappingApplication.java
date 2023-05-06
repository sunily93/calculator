package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMappingApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootMappingApplication.class, args);
		System.out.println(Calculator.add("2,5"));
	}
	
	

}
