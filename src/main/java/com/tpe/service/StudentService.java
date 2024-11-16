package com.tpe.service;

import com.tpe.domain.Student;
import com.tpe.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public void createStudent(Student student) {
        // email should be unique
        if (repository.existsByEmail(student.getEmail())) {

            throw new ConflictException("Email exists already!");
        }
        repository.save(student);
    }
}
