package com.wipro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.wipro.model.ContractEmployee;
import com.wipro.model.Employee;
import com.wipro.model.RegularEmployee;

public class ClientApp {

	public static void main(String[] args) {
		Employee e1=new Employee();    
        e1.setName("Manik");
        e1.setSalary(25000);
        
        
        RegularEmployee re1=new RegularEmployee();
        re1.setName("mukti");
        re1.setQplc(9000);
        re1.setSalary(25000);
        
        ContractEmployee ce1=new ContractEmployee();
        ce1.setName("Maddy");
        ce1.setAllowance("authorization only");
        ce1.setSalary(15000);
        
      Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class)
   		   .addAnnotatedClass(RegularEmployee.class).addAnnotatedClass(ContractEmployee.class);
 	 ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
 	 SessionFactory sf=con.buildSessionFactory(reg);
 	 Session session=sf.openSession();
 	 Transaction tx=session.beginTransaction();
 	 session.save(e1);
 	 session.save(re1);
 	 session.save(ce1);
 	 
 	 tx.commit();
 	 

	}

}
