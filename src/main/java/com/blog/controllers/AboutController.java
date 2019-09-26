package com.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.models.AboutInformation;
import com.blog.services.AboutInformationService;

@Controller
public class AboutController {
	
	@Autowired
	private AboutInformationService aboutService;
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String index(Model model) {
		AboutInformation aboutInformation = aboutService.getAbout(1);
		model.addAttribute("about", aboutInformation);
		return "about";
	}

}
