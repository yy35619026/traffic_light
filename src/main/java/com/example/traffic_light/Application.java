package com.example.traffic_light;

import com.example.database.Traffic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan({
		"com.example",
})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
}

