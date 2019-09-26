package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.models.ArticleInformation;
import com.blog.services.ArticlesInformationService;

@Controller
public class ArticlesController {
	
	@Autowired
	private ArticlesInformationService articleService;
	
	@RequestMapping(value = "/articles", method = RequestMethod.GET)
	public String index(Model model) {
		List<ArticleInformation> articleInformation = articleService.getArticleInformationList();
		model.addAttribute("articles", articleInformation);
		return "articles";
	}
	
	@RequestMapping(value="/article_detail/{article_id}", method=RequestMethod.GET)
	public String editPostG(Model model,@PathVariable("article_id") Integer id) {
		ArticleInformation article = articleService.getArticle(id);
		model.addAttribute("article", article);
		return  "detail_article";
	}
	
	
	

}
