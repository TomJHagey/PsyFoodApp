package com.example.PsyFoodApp;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class PsyFoodAppController {
	
	@RequestMapping("/")
	public ModelAndView index(HttpSession session) {
		return new ModelAndView("index");
	}

}
