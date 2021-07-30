package com.wipro.bean;

import java.util.HashMap;
import java.util.Map;

public class Continent {
	private Integer id;
	private String name;
	private Map<String,String> countries=new HashMap<String,String>();
	public Continent() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getCountries() {
		return countries;
	}
	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}
	

}
