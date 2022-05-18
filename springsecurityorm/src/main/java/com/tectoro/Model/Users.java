package com.tectoro.Model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="chinnure")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	
	private String uname;
	private String email;
	private String pwd;
	
	@ElementCollection
	@CollectionTable(name="rolestab",
	joinColumns = @JoinColumn(name="uid"))
	@Column(name="role")
	private List<String> roles;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", uname=" + uname + ", email=" + email + ", pwd=" + pwd + ", roles=" + roles
				+ "]";
	}

	public Users(int uid, String uname, String email, String pwd, List<String> roles) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.email = email;
		this.pwd = pwd;
		this.roles = roles;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	}
