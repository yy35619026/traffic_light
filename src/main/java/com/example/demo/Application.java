package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		new Traffic_Light_Controller();
		//SpringApplication.run(Traffic_Light_Controller.class, args);
	}
}

