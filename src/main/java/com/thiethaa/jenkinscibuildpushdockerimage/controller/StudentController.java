package com.thiethaa.jenkinscibuildpushdockerimage.controller;

import com.thiethaa.jenkinscibuildpushdockerimage.entity.Student;
import com.thiethaa.jenkinscibuildpushdockerimage.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @RequestMapping("/welcome")
    public String greeting(){
        return "Welcome To the Student Portal 2020 from Jenkins";
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }
}
