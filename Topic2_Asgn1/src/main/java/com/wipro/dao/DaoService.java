package com.wipro.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.wipro.model.Employee;

public class DaoService {
	
	Configuration con;
	ServiceRegistry reg;
	SessionFactory sf;
	Session session;
	Transaction tx;
	public DaoService() {
	    
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
	
	public void update(Employee emp) {
		session=sf.openSession();
		tx=session.beginTransaction();
		try{
			session.saveOrUpdate(emp);
			tx.commit();
			session.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void delete(Employee emp) {
		session=sf.openSession();
		tx=session.beginTransaction();
		try {
			session.delete(emp);
			tx.commit();
			session.close();
		} catch(Exception e) {
			System.out.println("employee with id :"+emp.getEmployeeId()+"doesnot exists in the database");
		}
	}
	
	public Employee read(int id)
	{
		session =sf.openSession();
		tx=session.beginTransaction();
			Employee emp=null;
		try {
			  emp=(Employee) session.get(Employee.class, 1003);
			  tx.commit();
			  session.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return emp;
	}
}
