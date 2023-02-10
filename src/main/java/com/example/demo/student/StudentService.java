package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // This annotation is used to mark a class as a service, it is a specialization of @Component
public class StudentService {
    public List<Student> getStudents() { // endpoint returns a list of students
        return List.of( // actually, this will come from database
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
