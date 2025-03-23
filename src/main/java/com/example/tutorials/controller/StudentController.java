package com.example.tutorials.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/getStudent")
    public List<String> getStudentName(){
        List<String> student = new ArrayList<>();
        student.add("Shree Shukla");
        student.add("Sadhvi Shukla");
        student.add("IndraMani Shukla");
        student.add("Gulla Shukla");
        return student;
    }
}
