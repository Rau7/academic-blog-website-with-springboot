package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.models.PostInformation;
import com.blog.services.PostsInformationService;

@Controller
public class PostsController {
	
	@Autowired
	private PostsInformationService postService;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public String index(Model model) {
		List<PostInformation> postInformation = postService.getPostInformationList();
		model.addAttribute("posts", postInformation);
		return "posts";
	}
	
	@RequestMapping(value="/post_detail/{post_id}", method=RequestMethod.GET)
	public String editPostG(Model model,@PathVariable("post_id") Integer id) {
		PostInformation post = postService.getPost(id);
		model.addAttribute("post", post);
		return  "detail_post";
	}
	
	
	

}
