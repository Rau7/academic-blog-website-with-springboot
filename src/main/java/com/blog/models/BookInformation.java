package com.blog.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books", catalog = "blogdb")
@SuppressWarnings("serial")
public class BookInformation implements Serializable {

	private Integer book_id;
	private String book_title;
	private String book_body;
	private String book_file;
	private String book_date;
	private String book_photo;
	private String book_short_wr;
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	public Integer getBook_id() {
		return book_id;
	}
	public void setBook_id(Integer book_id) {
		this.book_id = book_id;
	}
	@Basic
	@Column(name = "book_title")
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	@Basic
	@Column(name = "book_body")
	public String getBook_body() {
		return book_body;
	}
	public void setBook_body(String book_body) {
		this.book_body = book_body;
	}
	@Basic
	@Column(name = "book_file")
	public String getBook_file() {
		return book_file;
	}
	public void setBook_file(String book_file) {
		this.book_file = book_file;
	}
	@Basic
	@Column(name = "book_date")
	public String getBook_date() {
		return book_date;
	}
	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}
	@Basic
	@Column(name = "book_photo")
	public String getBook_photo() {
		return book_photo;
	}
	public void setBook_photo(String book_photo) {
		this.book_photo = book_photo;
	}
	@Basic
	@Column(name = "book_short_wr")
	public String getBook_short_wr() {
		return book_short_wr;
	}
	public void setBook_short_wr(String book_short_wr) {
		this.book_short_wr = book_short_wr;
	}
	
	
	
}