package com.example.demo.pojoclass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class pojo {
	@Id
	@Column(name="D-ID")
	private int donorid;
	@Column(name="D-NAME")
	private String donorname;
	@Column(name="D-BLOODGROUP")
	private String bgroup;
	@Column(name="D-AGE")
	private int age;
	@Column(name="D-phno")
	private String number;
	@Column(name="D-Address")
	private String address;
	@Column(name="D-parents phno")
	private int parentno;
	public int getDonorid() {
		return donorid;
	}
	public void setDonorid(int donorid) {
		this.donorid = donorid;
	} 
	public String getDonorname() {
		return donorname;
	}
	public void setDonorname(String donorname) {
		this.donorname = donorname;
	}
	public String getBgroup() {
		return bgroup;
	}
	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getParentno() {
		return parentno;
	}
	public void setParentno(int parentno) {
		this.parentno = parentno;
	}
}
