package com.wipro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int employeeId;
	private String EmployeeName;
	private String EmployeeBand;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, String employeeBand) {
		this.employeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeBand = employeeBand;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeBand() {
		return EmployeeBand;
	}
	public void setEmployeeBand(String employeeBand) {
		EmployeeBand = employeeBand;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", EmployeeName=" + EmployeeName + ", EmployeeBand="
				+ EmployeeBand + "]";
	}
	
	
	
	

}
