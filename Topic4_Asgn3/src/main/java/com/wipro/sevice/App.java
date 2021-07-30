package com.wipro.sevice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.wipro.model.Course;
import com.wipro.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	Student s=new Student();
    	s.setsId(1001);
    	s.setsName("navya");
    	s.setBranch("informationtechnology");
    	Student s1=new Student();
    	s1.setsId(1002);
    	s1.setsName("nandini");
    	s1.setBranch("computers");
    	Student s2=new Student();
    	s2.setsId(1003);
    	s2.setsName("manik");
    	s2.setBranch("electrical");
    	
    	Course c=new Course();
    	c.setCourseId(1);
    	c.setCourseName("edc");
    	c.getStudent().add(s);
       c.getStudent().add(s2);
       
    	Course c1=new Course();
    	c1.setCourseId(2);
    	c1.setCourseName("CN");
    	c1.getStudent().add(s1);
    	c1.getStudent().add(s);
    	
    	s.getCourse().add(c);
    	s.getCourse().add(c1);
    	s1.getCourse().add(c1);
    	s2.getCourse().add(c);
    	try {
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Course.class);
    	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings( con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(s);
    	session.save(s1);
    	session.save(s2);
    	session.save(c);
    	session.save(c1);
    	
    	tx.commit();}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
}
