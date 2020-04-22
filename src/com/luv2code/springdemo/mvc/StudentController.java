package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/")
	public String index() {
		return("student");
	}
	@RequestMapping("/confirmation")
	public String confirmation(
			@ModelAttribute("student") 
			Student student) {
		return("student-confirmation");
	}
	@RequestMapping("/form")
	public String form(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return("student-form");
	}
}