package com.example;

import com.example.traffic_light.AI;
import com.example.traffic_light.Traffic_Light;
import com.example.traffic_light.Traffic_Light_Controller;
import com.example.traffic_light.Traffic_Light_time;
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
//		SpringApplication.run(Application.class, args);
	}

}

