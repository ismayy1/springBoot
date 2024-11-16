package com.tpe.controller;

import com.tpe.domain.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
//@ResponseBody
@RequestMapping("/students")    // http://localhost:8080/students
@RestController // includes Controller + ResponseBody, so we don't need the other two
public class StudentController {

    // method to gt all students
    public ResponseEntity<List<Student>> getAll() {

        List<Student> studentList =
    }
}
