package com.tpe.controller;

import com.tpe.domain.Student;
import com.tpe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
//@ResponseBody
@RequestMapping("/students")    // http://localhost:8080/students
@RestController // includes Controller + ResponseBody, so we don't need the other two
public class StudentController {

    @Autowired
    private StudentService service;

    // method to gt all students
    // http://localhost:8080/students + GET
    @GetMapping
    public ResponseEntity<List<Student>> getAll() {

        List<Student> studentList = service.getAllStudents();
        return ResponseEntity.ok(studentList);  // it should return status code 200-> everything is ok, and list of students
//        return new ResponseEntity<>(studentList, HttpStatus.OK);    // alternative
    }

    // method to add student
    // http://localhost:8080/students + POST + body
    @PostMapping
    public ResponseEntity<Map<String, String>> createStudent(@Valid @RequestBody Student student) {

        service.createStudent(student);
        Map<String, String> map = new HashMap<>();
        map.put("message", "Student is created successfully");
        map.put("status", "true");
        return new ResponseEntity<>(map, HttpStatus.CREATED);   // 201
    }
}
