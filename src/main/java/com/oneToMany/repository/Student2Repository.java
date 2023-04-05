package com.oneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oneToMany.model.Student2;

@Repository
public interface Student2Repository extends JpaRepository<Student2, Integer> {

}
