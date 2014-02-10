package com.example.utils;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.models.Countries;

public class GetDataFromDB 
{
	 public static Session s = HibernateUtils.getSession();
	
	
	public static ArrayList<Countries> listAllCountries = null;
	
	
	public GetDataFromDB() {
		// TODO Auto-generated constructor stub
		listAllCountries = new ArrayList<>();
		
	}
	
	
	public static ArrayList<Countries> getData()
	{
	
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("from Countries");
		listAllCountries = (ArrayList<Countries>) q.list();
		tx.commit();
		s.close();
		
		return listAllCountries;
		
	}

}
