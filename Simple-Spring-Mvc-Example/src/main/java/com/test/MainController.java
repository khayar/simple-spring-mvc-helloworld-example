package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("msg", "hello world");
		return model;
	}
}
