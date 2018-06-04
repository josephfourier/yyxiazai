package com.yyxiazai.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String doLogin(ServletRequest request, Model model) {
		String shiroLoginFailure = (String) request.getAttribute("shiroLoginFailure");
		model.addAttribute("error", shiroLoginFailure);
		return "login";
	}
}
