package com.example.utils;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.example.models.Countries;



public class InsertDataIntoDB 
{
	
    Session s = HibernateUtils.getSession();
	
	
	Countries cnt1 = new Countries("111", "Algérie", "Afrique", 10000000, "Alger");
	Countries cnt2 = new Countries("222", "France", "Europe", 10000000, "Paris");
	Countries cnt3 = new Countries("333", "Suède", "Europe", 10000000, "Stockholm");
	Countries cnt4 = new Countries("444", "Canada", "Amérique", 10000000, "Ottawa");
	Countries cnt5 = new Countries("555", "USA", "Amérique", 10000000, "Washington");
	Countries cnt6 = new Countries("666", "Japon", "Asie", 10000000, "Tokyo");
	Countries cnt7 = new Countries("777", "Russie", "Asie", 10000000, "Moscou");
	
	
	ArrayList<Countries> cntrList = null;
	
	public InsertDataIntoDB()
	{
		cntrList = new ArrayList<>();
		
		cntrList.add(cnt1);
		cntrList.add(cnt2);
		cntrList.add(cnt3);
		cntrList.add(cnt4);
		cntrList.add(cnt5);
		cntrList.add(cnt6);
		cntrList.add(cnt7);
		
		for(Countries cnt : cntrList)
		{
			insert(cnt);
		}
		s.close();
	}
	
	public void insert(Countries cntr)
	{
		Transaction t = s.beginTransaction();
		s.save(cntr);
		System.out.println("Country saved !!!");
        t.commit();
	}

}
