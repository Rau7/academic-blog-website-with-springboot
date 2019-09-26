package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.models.WpaperInformation;
import com.blog.services.WpapersInformationService;

@Controller
public class WpapersController {
	
	@Autowired
	private WpapersInformationService wpaperService;
	
	@RequestMapping(value = "/wpapers", method = RequestMethod.GET)
	public String index(Model model) {
		List<WpaperInformation> wpaperInformation = wpaperService.getWpaperInformationList();
		model.addAttribute("wpapers", wpaperInformation);
		return "wpapers";
	}
	
	@RequestMapping(value="/wpaper_detail/{wpaper_id}", method=RequestMethod.GET)
	public String editPostG(Model model,@PathVariable("wpaper_id") Integer id) {
		WpaperInformation wpaper = wpaperService.getWpaper(id);
		model.addAttribute("wpaper", wpaper);
		return  "detail_wpaper";
	}
	
	
	

}
