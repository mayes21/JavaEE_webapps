package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtils 
{
	
	private static final SessionFactory sessionFactory;
	 
    // Crée une unique instance de la SessionFactory à partir de hibernate.cfg.xml
    static 
    {
        try 
        {
        	
        	Configuration configuration = new Configuration().configure();
        	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
        	applySettings(configuration.getProperties());
        	sessionFactory = configuration.buildSessionFactory(builder.build());
           
        } 
        catch (HibernateException ex) 
        {
            throw new RuntimeException("Problème de configuration : " + ex.getMessage(), ex);
        }
    }
 
    // Renvoie une session Hibernate
    public static Session getSession() throws HibernateException 
    {
    	//System.out.println("in getSession()");
        return sessionFactory.openSession();
    }
	

}
