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
@Table(name = "wpapers", catalog = "blogdb")
@SuppressWarnings("serial")
public class WpaperInformation implements Serializable {

	private Integer wpaper_id;
	private String wpaper_title;
	private String wpaper_body;
	private String wpaper_file;
	private String wpaper_date;
	private String wpaper_photo;
	private String wpaper_short_wr;
	
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wpaper_id")
	public Integer getWpaper_id() {
		return wpaper_id;
	}
	public void setWpaper_id(Integer wpaper_id) {
		this.wpaper_id = wpaper_id;
	}
	@Basic
	@Column(name = "wpaper_title")
	public String getWpaper_title() {
		return wpaper_title;
	}
	public void setWpaper_title(String wpaper_title) {
		this.wpaper_title = wpaper_title;
	}
	@Basic
	@Column(name = "wpaper_body")
	public String getWpaper_body() {
		return wpaper_body;
	}
	public void setWpaper_body(String wpaper_body) {
		this.wpaper_body = wpaper_body;
	}
	@Basic
	@Column(name = "wpaper_file")
	public String getWpaper_file() {
		return wpaper_file;
	}
	public void setWpaper_file(String wpaper_file) {
		this.wpaper_file = wpaper_file;
	}
	@Basic
	@Column(name = "wpaper_date")
	public String getWpaper_date() {
		return wpaper_date;
	}
	public void setWpaper_date(String wpaper_date) {
		this.wpaper_date = wpaper_date;
	}
	@Basic
	@Column(name = "wpaper_photo")
	public String getWpaper_photo() {
		return wpaper_photo;
	}
	public void setWpaper_photo(String wpaper_photo) {
		this.wpaper_photo = wpaper_photo;
	}
	@Basic
	@Column(name = "wpaper_short_wr")
	public String getWpaper_short_wr() {
		return wpaper_short_wr;
	}
	public void setWpaper_short_wr(String wpaper_short_wr) {
		this.wpaper_short_wr = wpaper_short_wr;
	}
	
	
	
	
	
}