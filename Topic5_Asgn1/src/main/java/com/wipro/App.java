package com.wipro;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

		Configuration con=new Configuration().configure().addAnnotatedClass(Car.class);
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session=sf.openSession();
    	Transaction tx= session.beginTransaction();
    	
    	Query q=session.createQuery("from Car");
    	List<Car> cars=q.list();
    	for(Car i :cars)
    	{
    		System.out.println(i);
    	}
    	tx.commit();
    }
}
