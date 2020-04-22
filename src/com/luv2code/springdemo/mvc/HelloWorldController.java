package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@RequestMapping("/")
	public String index() {
		return("helloworld");
	}
	@RequestMapping("/showform")
	public String showForm() {
		return("helloworld-showform");
	}
	@RequestMapping("/processform")
	public String processForm(
			@RequestParam("studentName") String studentName,
			Model model) {
		model.addAttribute("message", 
				studentName.toUpperCase());
		return("helloworld-processform");
	}
}