package com.app.efa.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	// landing page request page #1
	@RequestMapping("/")
	public String landing() {
		return "landing.html";
	}

	@RequestMapping("login")
	public String login() {
		return "login.html";
	}

	@RequestMapping("logout")
	public String logout() {
		return "logout.html";
	}

	@RequestMapping("register")
	public String register() {
		return "register.html";
	}

	@RequestMapping("contactus")
	public String contactus() {
		return "contactus.html";
	}


}
