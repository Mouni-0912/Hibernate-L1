package com.wipro.model;

import javax.persistence.*;
@Entity  
@DiscriminatorValue("regularemployee")  
public class RegularEmployee extends Employee {
	
	@Column(name="qplc")
	private int qplc;



	public int getQplc() {
		return qplc;
	}

	public void setQplc(int qplc) {
		this.qplc = qplc;
	}

}
