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
@Table(name = "posts", catalog = "blogdb")
@SuppressWarnings("serial")
public class PostInformation implements Serializable {

	private Integer post_id;
	private String post_title;
	private String post_body;
	private String post_file;
	private String post_date;
	private String post_photo;
	private String post_short_wr;
	
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	public Integer getPost_id() {
		return post_id;
	}
	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}
	@Basic
	@Column(name = "post_title")
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	@Basic
	@Column(name = "post_body")
	public String getPost_body() {
		return post_body;
	}
	public void setPost_body(String post_body) {
		this.post_body = post_body;
	}
	@Basic
	@Column(name = "post_file")
	public String getPost_file() {
		return post_file;
	}
	public void setPost_file(String post_file) {
		this.post_file = post_file;
	}
	@Basic
	@Column(name = "post_date")
	public String getPost_date() {
		return post_date;
	}
	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}
	@Basic
	@Column(name = "post_photo")
	public String getPost_photo() {
		return post_photo;
	}
	public void setPost_photo(String post_photo) {
		this.post_photo = post_photo;
	}
	@Basic
	@Column(name = "post_short_wr")
	public String getPost_short_wr() {
		return post_short_wr;
	}
	public void setPost_short_wr(String post_short_wr) {
		this.post_short_wr = post_short_wr;
	}
	
	
	
	
}