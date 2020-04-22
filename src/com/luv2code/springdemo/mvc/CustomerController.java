package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		 databinder.registerCustomEditor(
				 String.class, 
				 new StringTrimmerEditor(true));
	}
	@RequestMapping("/")
	public String index() {
		return("customer");
	}
	@RequestMapping("/confirm")
	public String confirm(
			@Valid @ModelAttribute("customer") 
			Customer customer,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return("customer-form");
		else
			return("customer-confirm");
	}
	@RequestMapping("/form")
	public String form(Model model) {
		model.addAttribute("customer", new Customer());
		return("customer-form");
	}
}