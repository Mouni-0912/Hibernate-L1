package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.wipro.model.Car;

public class DaoOperations {
	Configuration con;
	ServiceRegistry reg;
	SessionFactory sf;
	Session session;
	Transaction tx;
	public DaoOperations()
	{
	 con=new Configuration().configure().addAnnotatedClass(Car.class);
	 reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	 sf=con.buildSessionFactory(reg);
	}
	public void insert(Car c)
	{
	try 
	{
	      session=sf.openSession();
	    tx= session.beginTransaction();
	    session.save(c);
	tx.commit();
	session.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}

}
