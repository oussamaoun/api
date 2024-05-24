package com.oussama.student.controller;

import com.oussama.student.entity.StudentEntity;
import com.oussama.student.service.StudentService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class StudentController {

    @Autowired
    private StudentService service;
    @GetMapping("/ping")
    public String ping(){
        return "Ping -- API Student "+ LocalDateTime.now().toString();
    }

    @GetMapping("/StudentFind")
    public String StudentFind(@RequestParam String id){
        return "ID = "+id;
    }

    @GetMapping("/StudentFindByID")
    public StudentEntity StudentFindByID(@RequestParam Long id){

                return service.findStudentById(id);
    }

}
