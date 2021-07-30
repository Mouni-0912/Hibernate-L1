package com.wipro.bean;

public class Country {
	private Integer id;
	private String countryname;
	private String countrycapital;
	public Country() {
		
	}
	public Country(Integer id, String countryname, String countrycapital) {
		this.id = id;
		this.countryname = countryname;
		this.countrycapital = countrycapital;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		this.countrycapital = countrycapital;
	}
	

}
