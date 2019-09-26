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
@Table(name = "dashboard", catalog = "blogdb")
@SuppressWarnings("serial")
public class DashboardInformation implements Serializable {


	private Integer dashboard_id;
	private String dashboard_photo;
	private String dashboard_photo_2;
	private String dashboard_mid_photo;
	private String dashboard_writing_1;
	private String dashboard_writing_2;
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dashboard_id")
	public Integer getDashboard_id() {
		return dashboard_id;
	}
	public void setDashboard_id(Integer dashboard_id) {
		this.dashboard_id = dashboard_id;
	}
	@Basic
	@Column(name = "dashboard_photo")
	public String getDashboard_photo() {
		return dashboard_photo;
	}
	public void setDashboard_photo(String dashboard_photo) {
		this.dashboard_photo = dashboard_photo;
	}
	@Basic
	@Column(name = "dashboard_photo_2")
	public String getDashboard_photo_2() {
		return dashboard_photo_2;
	}
	public void setDashboard_photo_2(String dashboard_photo_2) {
		this.dashboard_photo_2 = dashboard_photo_2;
	}
	@Basic
	@Column(name = "dashboard_mid_photo")
	public String getDashboard_mid_photo() {
		return dashboard_mid_photo;
	}
	public void setDashboard_mid_photo(String dashboard_mid_photo) {
		this.dashboard_mid_photo = dashboard_mid_photo;
	}
	@Basic
	@Column(name = "dashboard_writing_1")
	public String getDashboard_writing_1() {
		return dashboard_writing_1;
	}
	public void setDashboard_writing_1(String dashboard_writing_1) {
		this.dashboard_writing_1 = dashboard_writing_1;
	}
	@Basic
	@Column(name = "dashboard_writing_2")
	public String getDashboard_writing_2() {
		return dashboard_writing_2;
	}
	public void setDashboard_writing_2(String dashboard_writing_2) {
		this.dashboard_writing_2 = dashboard_writing_2;
	}
	
}
