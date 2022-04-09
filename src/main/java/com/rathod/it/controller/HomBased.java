package com.rathod.it.controller;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomBased {
	
	@GetMapping("/hide")
		public String showpage() {
			//System.out.println(model.getClass().getName());
			//model.addAttribute("title","TEST ABCDEF !!!!");
			return "Home";
		
		
	}

}
