package com.example.demo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@SpringBootApplication

@Controller
public class NewprojApplication {
	
	@RequestMapping("/hello")
	public String display(HttpServletRequest req)
	{
		String name=req.getParameter("name");
		HttpSession session = req.getSession();
		session.setAttribute("displayName", name);
		return "NewFile1.jsp";
	}

}