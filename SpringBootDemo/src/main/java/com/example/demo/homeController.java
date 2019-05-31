package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	@RequestMapping("home")
	public String home(HttpServletRequest req)
	{
		System.out.println("^^^ Home controller called");
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		session.setAttribute("name", name);
		return "home";
	}

}
