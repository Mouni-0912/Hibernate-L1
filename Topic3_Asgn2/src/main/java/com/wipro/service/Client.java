package com.wipro.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.bean.Continent;
import com.wipro.bean.Country;
import com.wipro.util.HibernateUtil;

public class Client {
	public static void main(String[] args){
	Session session=null;
	try{
		session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Continent a1=new Continent();
		a1.setName("Australia");
		session.saveOrUpdate(a1);
		String country="South Africa";
		String capital="Pretoria";
		a1=(Continent)session.get(Continent.class, a1.getId());
		Map<String,String> countries=new LinkedHashMap<String,String>();
		Country c1=new Country();
		c1.setId(a1.getId());
		c1.setCountryname(country);
		c1.setCountrycapital(capital);
		countries.put(country,capital);
		a1.setCountries(countries);
		session.update(a1);
		tx.commit();
	}
	catch(HibernateException e){
		e.printStackTrace();
	}
	finally{
		session.close();
	}
	}

}
