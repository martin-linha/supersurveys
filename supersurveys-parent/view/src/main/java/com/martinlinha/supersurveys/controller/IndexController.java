package com.martinlinha.supersurveys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/")
	public ModelAndView doIndex() {
		return new ModelAndView("welcome", "hello", "Hello from index controller.");
	}
}
