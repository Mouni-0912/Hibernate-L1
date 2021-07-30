package com.wipro.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Passport {

	
	@Id
	private int PassportNum;
	@Column(nullable=false)
	private Date ExpiryDate;
	public Passport(int passportNum, Date expiryDate) {
		super();
		PassportNum = passportNum;
		ExpiryDate = expiryDate;
	}
	public int getPassportNum() {
		return PassportNum;
	}
	public void setPassportNum(int passportNum) {
		PassportNum = passportNum;
	}
	public Date getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		ExpiryDate = expiryDate;
	}
	
	
}
