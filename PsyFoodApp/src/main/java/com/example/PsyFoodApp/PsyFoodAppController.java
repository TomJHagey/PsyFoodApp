package com.example.PsyFoodApp;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PsyFoodAppController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

}
