package com.blog.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.daos.BooksInformationDao;
import com.blog.models.BookInformation;

@Service
@Transactional
public class BooksInformationServiceImpl implements BooksInformationService {
	
	@Autowired
	private BooksInformationDao bookInformation;

	@Override
	public BookInformation getBook(Integer book_id) {
		// TODO Auto-generated method stub
		return bookInformation.getBook(book_id);
	}

	@Override
	public void save(BookInformation book) {
		// TODO Auto-generated method stub
		bookInformation.save(book);
	}

	@Override
	public List<BookInformation> getBookInformationList() {
		// TODO Auto-generated method stub
		return bookInformation.getBookInformationList();
	}

	@Override
	public void updateBook(BookInformation book) {
		// TODO Auto-generated method stub
		bookInformation.updateBook(book);
	}

	@Override
	public void deleteBook(BookInformation book) {
		// TODO Auto-generated method stub
		bookInformation.deleteBook(book);
	}
}
