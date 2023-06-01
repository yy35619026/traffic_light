package com.example.traffic_light;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan({
		"com.example",
})
public class Application {

	public static void main(String[] args) {
		new Traffic_Light_Controller();
//		new Traffic_Light();
//		SpringApplication.run(Traffic_Light.class, args);

		SpringApplication.run(Traffic_Light_Controller.class, args);
		//SpringApplication.run(Application.class, args);
	}
}

