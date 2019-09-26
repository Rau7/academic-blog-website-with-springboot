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
@Table(name = "articles", catalog = "blogdb")
@SuppressWarnings("serial")
public class ArticleInformation implements Serializable {

	private Integer article_id;
	private String article_title;
	private String article_body;
	private String article_file;
	private String article_date;
	private String article_photo;
	private String article_short_wr;
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "article_id")
	public Integer getArticle_id() {
		return article_id;
	}
	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}
	@Basic
	@Column(name = "article_title")
	public String getArticle_title() {
		return article_title;
	}
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}
	@Basic
	@Column(name = "article_body")
	public String getArticle_body() {
		return article_body;
	}
	public void setArticle_body(String article_body) {
		this.article_body = article_body;
	}
	@Basic
	@Column(name = "article_file")
	public String getArticle_file() {
		return article_file;
	}
	public void setArticle_file(String article_file) {
		this.article_file = article_file;
	}
	@Basic
	@Column(name = "article_date")
	public String getArticle_date() {
		return article_date;
	}
	public void setArticle_date(String article_date) {
		this.article_date = article_date;
	}
	@Basic
	@Column(name = "article_photo")
	public String getArticle_photo() {
		return article_photo;
	}
	public void setArticle_photo(String article_photo) {
		this.article_photo = article_photo;
	}
	@Basic
	@Column(name = "article_short_wr")
	public String getArticle_short_wr() {
		return article_short_wr;
	}
	public void setArticle_short_wr(String article_short_wr) {
		this.article_short_wr = article_short_wr;
	}
	
	
}