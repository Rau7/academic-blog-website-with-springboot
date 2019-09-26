package com.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.models.BookInformation;
import com.blog.services.BooksInformationService;

@Controller
public class BooksController {
	
	@Autowired
	private BooksInformationService bookService;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String index(Model model) {
		List<BookInformation> bookInformation = bookService.getBookInformationList();
		model.addAttribute("books", bookInformation);
		return "books";
	}
	
	@RequestMapping(value="/book_detail/{book_id}", method=RequestMethod.GET)
	public String editPostG(Model model,@PathVariable("book_id") Integer id) {
		BookInformation book = bookService.getBook(id);
		model.addAttribute("book", book);
		return  "detail_book";
	}
	
	
	

}
