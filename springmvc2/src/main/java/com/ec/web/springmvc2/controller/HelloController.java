package com.ec.web.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String hello(Model model){
		int a = 10;
		System.out.println("xxxxxxaaxxxxxxxx");
		model.addAttribute("username", "shicy");
		model.addAttribute("password", "test..");
		return "hello";
	}
}
