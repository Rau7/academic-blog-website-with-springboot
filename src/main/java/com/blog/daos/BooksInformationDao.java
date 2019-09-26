package com.blog.daos;

import java.util.List;

import com.blog.models.BookInformation;

public interface BooksInformationDao {
	
	BookInformation getBook(Integer book_id);

	void save(BookInformation book);

	List<BookInformation> getBookInformationList();

	void updateBook(BookInformation book);

	void deleteBook(BookInformation book);
}
