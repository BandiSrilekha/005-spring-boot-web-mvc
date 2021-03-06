package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	//1. show Employee Register page
	@GetMapping("/register")
	public String showMapping()
	{
		return "EmpRegister";
		
	}
	//2. read form data on click submit
	@PostMapping("/create")
	public String readFormData(
			@ModelAttribute Employee employee,
			Model model
			)
	{
		System.out.println("FORM DATA IS=>" + employee);
		model.addAttribute("eob", employee);
		return "EmpSuccess";
	}
			
			
			
}
