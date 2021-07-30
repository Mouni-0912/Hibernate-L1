package com.wipro.service;

import com.wipro.dao.DaoOperations;
import com.wipro.model.Car;

public class CreateTable {

	public static void main(String[] args)
	{
		Car c1=new Car("KL-07 AB 123","Polo", "White", "Volkswagen", 700000);
		Car c2=new Car("KL-07 AB 234", "Vento","Black", "Volkswagen", 600000);
		Car c3=new Car("KL-07 AC 345","Corolla", "Silver","Toyota" ,1000000);
		Car c4=new Car("KL-07 BC 123", "Sail Uva", "Red", "Chevrolet",500000);
		
		DaoOperations da=new DaoOperations();
		da.insert(c1);
		da.insert(c2);
		da.insert(c3);
		da.insert(c4);
		
		
	}
}
