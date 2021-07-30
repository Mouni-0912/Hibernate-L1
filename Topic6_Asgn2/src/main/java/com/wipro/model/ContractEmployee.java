package com.wipro.model;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("contractemployee")  
public class ContractEmployee extends Employee {
	
	@Column(name="Allowance")
	private String Allowance;

	

	public String getAllowance() {
		return Allowance;
	}

	public void setAllowance(String allowance) {
		Allowance = allowance;
	}

}
