package com.tyss.benchmanage.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
@Table(name="user")
public class User {
	@Id
//	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.benchmanage.controller.UserIdGenerator")
	//@GeneratedValue(generator = "string_based_custom_sequence")
	@GeneratedValue
	private String id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private long pno;
	@Column
	private String password;
	@Column
	private char gender;
	@Column
	private String roll;
	@Column
	private Date DOB;
	@Column
	private Date DOJ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPno() {
		return pno;
	}
	public void setPno(long pno) {
		this.pno = pno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public Date getDOJ() {
		return DOJ;
	}
	public void setDOJ(Date dOJ) {
		DOJ = dOJ;
	}

}
