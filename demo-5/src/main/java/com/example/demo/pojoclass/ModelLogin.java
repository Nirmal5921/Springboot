package com.example.demo.pojoclass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="donorlogin")
public class ModelLogin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String uname;
	private String pwd;
	public int getId() {
		return id;
	}
	public String getUname() {
		return uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
