package com.wipro;

import com.wipro.dao.DaoService;
import com.wipro.model.Employee;

public class ClientCode {
	
	public static void main(String[] args)
	{
		
		Employee e1=new Employee(1001,"clarke","TBROW");
		Employee e2=new Employee(1002,"bellamy","Band-B1");
		Employee e3=new Employee(1003,"octavia","Band-B2");
		Employee e4=new Employee(1004,"raven","Band-B3");
		Employee e5=new Employee(1005,"murphy","Band-C1");
		Employee e6=new Employee(1006,"meclla","Band-C2");
		
		
				
		DaoService dao=new DaoService();
		dao.insert(e1);
		dao.insert(e2);
		dao.insert(e3);
		dao.insert(e4);
		dao.insert(e5);
		dao.insert(e6);
		
		e3.setEmployeeName("utkarsh");//updating employee name
		dao.update(e3);
		
		dao.delete(e2);
		Employee result = dao.read(1003);
			System.out.println(result);
		
	}
	

}
