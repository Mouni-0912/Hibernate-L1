package com.wipro.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.wipro.model.Question;

public class ClientApp {
	public static void main(String[] args)
	{
	
	Configuration con=new Configuration().configure().addAnnotatedClass(Question.class);
	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
       SessionFactory sf=con.buildSessionFactory(reg);
     Session session=sf.openSession();  
    Transaction tx=session.beginTransaction();  
    
     List<String> set1=new ArrayList<String>();
     set1.add("Java is a programming language");    
     set1.add("Java is a platform");    
         
     ArrayList<String> set2=new ArrayList<String>();    
     set2.add("Servlet is an Interface");    
     set2.add("Servlet is an API");    
         
     Question question1=new Question();    
     question1.setQname("What is Java?");    
     question1.setOptions(set1);
     question1.setAnswer("java is aprogramming language");
         
     Question question2=new Question();    
     question2.setQname("What is Servlet?"); 
     question1.setOptions(set2);
     question2.setAnswer("servlet is an API");    
         
     session.save(question1);    
     session.save(question2);    
         
     tx.commit();    
       
     
	}
     
 
}
