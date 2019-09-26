package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.models.GalleryInformation;
import com.blog.services.GalleryInformationService;

@Controller
public class GalleryController {
	
	@Autowired
	private GalleryInformationService galleryService;
	
	@RequestMapping(value = "/gallery", method = RequestMethod.GET)
	public String index(Model model) {
		List<GalleryInformation> galleryInformation = galleryService.getGalleryInformationList();
		model.addAttribute("gallery", galleryInformation);
		return "gallery";
	}
	
}
