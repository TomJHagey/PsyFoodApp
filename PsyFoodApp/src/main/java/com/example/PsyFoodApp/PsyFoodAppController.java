package com.example.PsyFoodApp;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.PsyFoodApp.dao.PsyFoodDao;

@Controller
public class PsyFoodAppController {
	
	@Autowired
	PsyFoodDao psyFoodDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}

}
