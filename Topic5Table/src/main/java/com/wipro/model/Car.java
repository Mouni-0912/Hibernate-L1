package com.wipro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private String RegNo;
	private String Model;
	private String Color;
	private String Manufacturer;
	private long Price;
	public Car(String regNo, String model, String color, String manufacturer, long price) {
		RegNo = regNo;
		Model = model;
		Color = color;
		Manufacturer = manufacturer;
		Price = price;
	}
	public String getRegNo() {
		return RegNo;
	}
	public void setRegNo(String regNo) {
		RegNo = regNo;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Car [RegNo=" + RegNo + ", Model=" + Model + ", Color=" + Color + ", Manufacturer=" + Manufacturer
				+ ", Price=" + Price + "]";
	}
	

}
