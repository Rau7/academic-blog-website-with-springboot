package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.models.ArticleInformation;
import com.blog.models.BookInformation;
import com.blog.models.DashboardInformation;
import com.blog.models.PostInformation;
import com.blog.services.ArticlesInformationService;
import com.blog.services.BooksInformationService;
import com.blog.services.DashboardInformationService;
import com.blog.services.PostsInformationService;
import com.blog.models.AboutInformation;
import com.blog.services.AboutInformationService;

@Controller
public class DashboardController {

	@Autowired
	private AboutInformationService aboutService;
	
	@Autowired
	private PostsInformationService postService;
	
	@Autowired
	private DashboardInformationService dashService;
	
	@Autowired
	private ArticlesInformationService articleService;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String index(Model model) {
		DashboardInformation dashboard=dashService.getDashboard(1);
		AboutInformation aboutInformation = aboutService.getAbout(1);
		List<PostInformation> posts = postService.getPostInformationList();
		List<ArticleInformation> articles =articleService.getArticleInformationList();
		model.addAttribute("dashboard",dashboard);
		model.addAttribute("about", aboutInformation);
		model.addAttribute("posts", posts);
		model.addAttribute("articles",articles);
		return "dashboard";
	}
	
}
