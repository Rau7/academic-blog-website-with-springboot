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
@Table(name = "about", catalog = "blogdb")
@SuppressWarnings("serial")
public class AboutInformation implements Serializable {

	private Integer about_id;
	private String about_title;
	private String about_desc;
	private String about_file;
	private String social_email;
	private String social_email2;
	private String social_facebook;
	private String social_twitter;
	private String social_instagram;
	private String social_skype;
	private String social_linkedin;
	private String social_reddit;
	private String social_youtube;
	private String about_dash_photo;
	private String about_mid_wr;
	private String about_short_wr;
	private String about_page_p1;
	private String about_page_p2;
	private String about_page_p3;
	private String about_page_p4;
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "about_id")
	public Integer getAbout_id() {
		return about_id;
	}
	public void setAbout_id(Integer about_id) {
		this.about_id = about_id;
	}
	@Basic
	@Column(name = "about_title")
	public String getAbout_title() {
		return about_title;
	}
	public void setAbout_title(String about_title) {
		this.about_title = about_title;
	}
	@Basic
	@Column(name = "about_desc")
	public String getAbout_desc() {
		return about_desc;
	}
	public void setAbout_desc(String about_desc) {
		this.about_desc = about_desc;
	}
	@Basic
	@Column(name = "about_file")
	public String getAbout_file() {
		return about_file;
	}
	public void setAbout_file(String about_file) {
		this.about_file = about_file;
	}
	@Basic
	@Column(name = "social_email")
	public String getSocial_email() {
		return social_email;
	}
	public void setSocial_email(String social_email) {
		this.social_email = social_email;
	}
	@Basic
	@Column(name = "social_email2")
	public String getSocial_email2() {
		return social_email2;
	}
	public void setSocial_email2(String social_email2) {
		this.social_email2 = social_email2;
	}
	@Basic
	@Column(name = "social_facebook")
	public String getSocial_facebook() {
		return social_facebook;
	}
	public void setSocial_facebook(String social_facebook) {
		this.social_facebook = social_facebook;
	}
	@Basic
	@Column(name = "social_twitter")
	public String getSocial_twitter() {
		return social_twitter;
	}
	public void setSocial_twitter(String social_twitter) {
		this.social_twitter = social_twitter;
	}
	@Basic
	@Column(name = "social_instagram")
	public String getSocial_instagram() {
		return social_instagram;
	}
	public void setSocial_instagram(String social_instagram) {
		this.social_instagram = social_instagram;
	}
	@Basic
	@Column(name = "social_skype")
	public String getSocial_skype() {
		return social_skype;
	}
	public void setSocial_skype(String social_skype) {
		this.social_skype = social_skype;
	}
	@Basic
	@Column(name = "social_linkedin")
	public String getSocial_linkedin() {
		return social_linkedin;
	}
	public void setSocial_linkedin(String social_linkedin) {
		this.social_linkedin = social_linkedin;
	}
	@Basic
	@Column(name = "social_reddit")
	public String getSocial_reddit() {
		return social_reddit;
	}
	public void setSocial_reddit(String social_reddit) {
		this.social_reddit = social_reddit;
	}
	@Basic
	@Column(name = "social_youtube")
	public String getSocial_youtube() {
		return social_youtube;
	}
	public void setSocial_youtube(String social_youtube) {
		this.social_youtube = social_youtube;
	}
	@Basic
	@Column(name = "about_dash_photo")
	public String getAbout_dash_photo() {
		return about_dash_photo;
	}
	public void setAbout_dash_photo(String about_dash_photo) {
		this.about_dash_photo = about_dash_photo;
	}
	@Basic
	@Column(name = "about_mid_wr")
	public String getAbout_mid_wr() {
		return about_mid_wr;
	}
	public void setAbout_mid_wr(String about_mid_wr) {
		this.about_mid_wr = about_mid_wr;
	}
	@Basic
	@Column(name = "about_short_wr")
	public String getAbout_short_wr() {
		return about_short_wr;
	}
	public void setAbout_short_wr(String about_short_wr) {
		this.about_short_wr = about_short_wr;
	}
	@Basic
	@Column(name = "about_page_p1")
	public String getAbout_page_p1() {
		return about_page_p1;
	}
	public void setAbout_page_p1(String about_page_p1) {
		this.about_page_p1 = about_page_p1;
	}
	@Basic
	@Column(name = "about_page_p2")
	public String getAbout_page_p2() {
		return about_page_p2;
	}
	public void setAbout_page_p2(String about_page_p2) {
		this.about_page_p2 = about_page_p2;
	}
	@Basic
	@Column(name = "about_page_p3")
	public String getAbout_page_p3() {
		return about_page_p3;
	}
	public void setAbout_page_p3(String about_page_p3) {
		this.about_page_p3 = about_page_p3;
	}
	@Basic
	@Column(name = "about_page_p4")
	public String getAbout_page_p4() {
		return about_page_p4;
	}
	public void setAbout_page_p4(String about_page_p4) {
		this.about_page_p4 = about_page_p4;
	}
	
}