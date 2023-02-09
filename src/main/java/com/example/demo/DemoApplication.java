package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.String;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController // This annotation is used to mark a class as a controller, serving rest endpoints
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/query") // This annotation is used to map HTTP requests to handler methods, this is rest endpoint.
	public List<Student> hello() { // Returns JSON array
		return List.of( // endpoint returns a list of students
				new Student(
						1L,
						"Cristiano Ronaldo",
						"cristiano.ronaldo@getir.com",
						LocalDate.of(1985, Month.FEBRUARY, 5),
						36
				)
		);
	}
}
