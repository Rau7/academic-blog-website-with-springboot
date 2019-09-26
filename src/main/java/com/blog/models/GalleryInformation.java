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
@Table(name = "gallerys", catalog = "blogdb")
@SuppressWarnings("serial")
public class GalleryInformation implements Serializable {

	private Integer gallery_id;
	private String gallery_title;
	private String gallery_desc;
	private String gallery_photo;
	private String gallery_date;
	
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gallery_id")
	public Integer getGallery_id() {
		return gallery_id;
	}
	public void setGallery_id(Integer gallery_id) {
		this.gallery_id = gallery_id;
	}
	@Basic
	@Column(name = "gallery_title")
	public String getGallery_title() {
		return gallery_title;
	}
	public void setGallery_title(String gallery_title) {
		this.gallery_title = gallery_title;
	}
	public String getGallery_desc() {
		return gallery_desc;
	}
	public void setGallery_desc(String gallery_desc) {
		this.gallery_desc = gallery_desc;
	}
	public String getGallery_photo() {
		return gallery_photo;
	}
	public void setGallery_photo(String gallery_photo) {
		this.gallery_photo = gallery_photo;
	}
	public String getGallery_date() {
		return gallery_date;
	}
	public void setGallery_date(String gallery_date) {
		this.gallery_date = gallery_date;
	}
	
	
	
	
	
}