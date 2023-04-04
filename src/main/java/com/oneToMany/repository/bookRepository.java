package com.oneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oneToMany.model.Book;

public interface bookRepository extends JpaRepository<Book, Integer>{

}
