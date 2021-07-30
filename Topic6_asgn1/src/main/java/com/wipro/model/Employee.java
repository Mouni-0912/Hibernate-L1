package com.wipro.model;


import javax.persistence.*;
@Entity
@Table(name="employee101")
@Inheritance(strategy =InheritanceType.JOINED)
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Empid")  
	private int id;
	@Column(name = "EmpName")  
	private String name;
	@Column(name="EmpSalary")
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
