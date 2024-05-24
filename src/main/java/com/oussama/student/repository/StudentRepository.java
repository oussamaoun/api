package com.oussama.student.repository;

import com.oussama.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    StudentEntity getStudentById(Long id);

    StudentEntity getStudentByCin(String cin);






}
