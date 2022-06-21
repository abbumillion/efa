package com.app.efa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.efa.Service.AdminService;


@RestController
public class AdminController {

	// administrator service
	@Autowired
	private AdminService adminService;
	
	public String getAllAdmins() 
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("admins.html");
	//	mv.addAllObjects(adminService.getAllAdmins());
		return "admins.html";
	}
	//public String systemStatus()
	
	
	
	

}
