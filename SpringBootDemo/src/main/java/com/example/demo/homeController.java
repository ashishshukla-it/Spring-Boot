package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	@RequestMapping("home")
	public String home()
	{
		System.out.println("^^^ Home controller called");
		return "home";
	}

}

// Here we have removed .jsp from home and moved home.jsp into 'pages' folder inside webapp. So we have to make concerned changes in 
// application.properties. There will be no change in the url.