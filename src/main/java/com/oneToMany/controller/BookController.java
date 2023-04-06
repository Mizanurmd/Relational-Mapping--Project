package com.oneToMany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oneToMany.repository.bookRepository;

@Controller
public class BookController {
	
	@Autowired
	private bookRepository boRepository;
	
	@ResponseBody
	@GetMapping("/")
	public String home() {
		return "/view/index.html";
	}

}
