package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	@RequestMapping("home")
	public String home()
	{
		System.out.println("^^^ Home controller called");
		return "home.jsp";
	}

}

// We have to add jasper maven dependency in pom.xml. This is because jsp is an old technology and spring 
// boot by default does not support it.