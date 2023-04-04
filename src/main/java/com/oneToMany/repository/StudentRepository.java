package com.oneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToMany.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
