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
@Table(name = "users", catalog = "blogdb")
@SuppressWarnings("serial")
public class UserInformation implements Serializable {

	private Integer user_id;
	private String user_name;
	private String user_email;
	private String user_password;
	private Integer user_oradmin;
	private Integer user_status;
	private String user_created;
	
	
	@Basic
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Basic
	@Column(name = "user_name")
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Basic
	@Column(name = "user_email")
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	@Basic
	@Column(name = "user_password")
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	@Basic
	@Column(name = "user_oradmin")
	public Integer getUser_oradmin() {
		return user_oradmin;
	}
	public void setUser_oradmin(Integer user_oradmin) {
		this.user_oradmin = user_oradmin;
	}
	@Basic
	@Column(name = "user_status")
	public Integer getUser_status() {
		return user_status;
	}
	public void setUser_status(Integer user_status) {
		this.user_status = user_status;
	}
	@Basic
	@Column(name = "user_created")
	public String getUser_created() {
		return user_created;
	}
	public void setUser_created(String user_created) {
		this.user_created = user_created;
	}
	
	
}