package com.hms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hms.model.AppointmentFix;
import com.hms.model.LoginPage;
import com.hms.service.LoginPageService;

@Controller
public class HMSController  {
	
	/*
	 * @GetMapping("/login") public String loginPage() { return "login"; }
	 */
	
	@Autowired
	LoginPageService loginPageService;
	
	@GetMapping("/msg")
	@ResponseBody
	public String getMessahe() {
		return "Hi";
	}
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login",new LoginPage());
		mv.setViewName("loginPage");
		return mv;
		
	}
	
	
	  @GetMapping("/registration") 
	  public ModelAndView registrationPage() {
	  ModelAndView mv = new ModelAndView(); 
	  mv.addObject("appointmentdetails",new
	  AppointmentFix());
	  mv.setViewName("appointmentFix"); 
	  return mv;
	}
	  
	  
	  
	  @PostMapping("/save")
	  
	  @ResponseBody
	  public String saveAppointmentDetails(@ModelAttribute("appointmentdetails") AppointmentFix
	  appointmentFix) {
		  System.out.println(appointmentFix); 
		  return "save"; 
		  }
	 

}
