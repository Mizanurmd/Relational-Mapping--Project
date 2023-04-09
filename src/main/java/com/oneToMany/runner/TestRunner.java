package com.oneToMany.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oneToMany.model.Book;
import com.oneToMany.model.Student;
import com.oneToMany.repository.StudentRepository;
import com.oneToMany.repository.bookRepository;



@Component
public class TestRunner implements CommandLineRunner {
	
	@Autowired
	private StudentRepository sRepo;
	@Autowired
	private bookRepository bRepo;

	@Override
	//@PostConstruct
	public void run(String... args) throws Exception {
		
		Book b = new Book(1, "Advance Java");
		Book b1 = new Book(2, "python");
		Book b2 = new Book(3, "C++");
		Book b3 = new Book(4, "JavaScript");
		Book b4 = new Book(5, "Core Java");
		
		bRepo.save(b);
		bRepo.save(b1);
		bRepo.save(b2);
		bRepo.save(b3);
		bRepo.save(b4);
		System.out.println(b);
		//////////// set book object in student///////
		Set<Book>sb = Set.of(b,b1,b2,b3,b4);
		
		/////////// for Students/////////
		Student s = new Student(101,"Mizanur",sb);
		Student s1 = new Student(102,"Sizan",sb);
		Student s2 = new Student(103,"Rajib",sb);
		Student s3 = new Student(104,"Mamun",sb);
		Student s4 = new Student(105,"tawhid",sb);
		
		sRepo.save(s);
		sRepo.save(s1);
		sRepo.save(s2);
		sRepo.save(s3);
		sRepo.save(s4);
		System.out.println(s);
		
		
	}

}
