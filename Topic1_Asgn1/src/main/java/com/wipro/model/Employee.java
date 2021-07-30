package com.wipro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	private String Name;
	@Id
	@GeneratedValue
	private int EmpId;
	private String Designtaion;
	private long Salary;
	public Employee(String name, String designtaion, long salary) {
		super();
		Name = name;
		Designtaion = designtaion;
		Salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getDesigntaion() {
		return Designtaion;
	}
	public void setDesigntaion(String designtaion) {
		Designtaion = designtaion;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		Salary = salary;
	}
	
	
	

}
