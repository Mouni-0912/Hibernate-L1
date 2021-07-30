package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.wipro.model.Employee;

public class DaoSevice {
	Configuration con;
	ServiceRegistry reg;
	SessionFactory sf;
	Session session;
	Transaction tx;
	public DaoSevice() {
	    
		con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
	    reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();;
	    sf=con.buildSessionFactory(reg);  
	}
	
	
	public void insert(Employee emp)
	{
		session=sf.openSession();
		tx=session.beginTransaction();
		try {
			session.save(emp);
			tx.commit();
			session.close();
		}catch(Exception e) {
			System.out.println(e);
		}
}
}