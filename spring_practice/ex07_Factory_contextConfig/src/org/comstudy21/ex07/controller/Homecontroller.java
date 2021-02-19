package org.comstudy21.ex07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Homecontroller {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("title","welcome to my homepage!");
		return "/WEB-INF/views/home.jsp";
	}
}
