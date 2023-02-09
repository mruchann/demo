package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
