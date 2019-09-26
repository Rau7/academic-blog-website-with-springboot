package com.blog.daos;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.blog.models.BookInformation;

@Repository
public class BooksInformationDaoImpl implements BooksInformationDao {

	@Autowired
    private EntityManager entityManager;

    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	
	@Override
	public BookInformation getBook(Integer book_id) {
		BookInformation bookInformation = (BookInformation)getSession().get(BookInformation.class, book_id);
		return bookInformation;
	}

	@Override
	public void save(BookInformation book) {
		getSession().save(book);
		
	}

	@Override
	public List<BookInformation> getBookInformationList() {
		return getSession().createCriteria(BookInformation.class).list();
	}

	@Override
	public void updateBook(BookInformation book) {
		getSession().update(book);
		
	}

	@Override
	public void deleteBook(BookInformation book) {
		getSession().delete(book);
		
	}

}
