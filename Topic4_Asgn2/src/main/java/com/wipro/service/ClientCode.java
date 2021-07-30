package com.wipro.service;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.wipro.model.Employee;
import com.wipro.model.Passport;

public class ClientCode {
	public static void main(String[] args)
	{

	  
	  Passport p1=new Passport(98675423,new Date());
	  Employee e1=new Employee("niharika",28000,p1);
	  
	  Passport p2=new Passport(98674321,new Date());
	  Employee e2=new Employee("komalika",28000,p2);
	  Passport p3=new Passport(23459876,new Date());
	  Employee e3=new Employee("uttej",28000,p3);
	  Passport p4=new Passport(12348765,new Date());
	  Employee e4=new Employee("parth",28000,p4);
	  
	  Configuration con= new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Passport.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
	     session.save(e1);
	     session.save(p1);
	     session.save(e2);
	     session.save(p2);
	     session.save(e3);
	     session.save(p3);
	     session.save(e4);
	     session.save(p4);
	     
	     
	     Employee delem=(Employee)session.get(Employee.class,1);
	     if(delem == null)
	    	 System.out.println("employee with the requested id doesnot exists");
	     else
	     {
	    	 session.delete(delem);
	    	 int n=delem.getPassport().getPassportNum();
	    	 if(n!=0)
	    	 {
	    		 Passport p=(Passport)session.get(Passport.class, n);
	    		session.delete(p); 
	    	 }
	    	 System.out.println(" employee and their passport detais for requested id are deleted");
	    	 
	     }
	     
	     tx.commit();
	     
	}
	
	

}
