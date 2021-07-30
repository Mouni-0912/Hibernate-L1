package com.wipro;



import com.wipro.dao.DaoSevice;
import com.wipro.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Employee e1=new Employee("mouni","Developer",22600);
    	Employee e2=new Employee("meghu","Adminstrator",23000);
    	Employee e3=new Employee("madhu","Developer",22600);
    	Employee e4=new Employee("sowmya","Analyst",22400);
    	Employee e5=new Employee("madhuri","Developer",22600);
    	
    	
    	DaoSevice da=new DaoSevice();
    	da.insert(e1);
    	da.insert(e2);
    	da.insert(e3);
    	da.insert(e4);
    	da.insert(e5);
    	
    	
    	
    }
}
