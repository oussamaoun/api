package com.oussama.student.service;

import com.oussama.student.entity.StudentEntity;
import com.oussama.student.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository repository;

    public StudentEntity findStudentById(Long id){
        return repository.getStudentById(id);
    }
}
