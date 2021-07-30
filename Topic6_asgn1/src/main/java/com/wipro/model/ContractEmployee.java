package com.wipro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="Contract_Employee")
@PrimaryKeyJoinColumn(name="ID")  
public class ContractEmployee extends Employee{
	
	@Column(name="Allowance")
	private String Allowance;

	

	public String getAllowance() {
		return Allowance;
	}

	public void setAllowance(String allowance) {
		Allowance = allowance;
	}
	
	
	

}
