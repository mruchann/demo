package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.String;
import java.util.List;

@SpringBootApplication
@RestController // This annotation is used to mark a class as a controller, serving rest endpoints
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/query") // This annotation is used to map HTTP requests to handler methods, this is rest endpoint.
	public List hello() { // Returns JSON array
		return List.of("Hello", "World");
	}
}
