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
@Table(name = "comments", catalog = "blogdb")
@SuppressWarnings("serial")
public class CommentInformation implements Serializable {

	private Integer comment_id;
	private Integer comment_byname;
	private String comment_title;
	private String comment_body;
	private Integer comment_verified;
	private String comment_date;
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comment_id")
	public Integer getComment_id() {
		return comment_id;
	}
	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}
	@Basic
	@Column(name = "comment_byname")
	public Integer getComment_byname() {
		return comment_byname;
	}
	public void setComment_byname(Integer comment_byname) {
		this.comment_byname = comment_byname;
	}
	@Basic
	@Column(name = "comment_title")
	public String getComment_title() {
		return comment_title;
	}
	public void setComment_title(String comment_title) {
		this.comment_title = comment_title;
	}
	@Basic
	@Column(name = "comment_body")
	public String getComment_body() {
		return comment_body;
	}
	public void setComment_body(String comment_body) {
		this.comment_body = comment_body;
	}
	@Basic
	@Column(name = "comment_verified")
	public Integer getComment_verified() {
		return comment_verified;
	}
	public void setComment_verified(Integer comment_verified) {
		this.comment_verified = comment_verified;
	}
	@Basic
	@Column(name = "comment_date")
	public String getComment_date() {
		return comment_date;
	}
	public void setComment_date(String comment_date) {
		this.comment_date = comment_date;
	}
	
	
}