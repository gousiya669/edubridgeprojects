package com.edubridge.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
    	try {
    		StandardServiceRegistry standardRegistry = 
    	       new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    		Metadata metaData = 
    	        new MetadataSources(standardRegistry).getMetadataBuilder().build();
    		sessionFactory = metaData.getSessionFactoryBuilder().build();
    	   } catch (Throwable th) {
    		System.err.println("Enitial SessionFactory creation failed" + th);
    		throw new ExceptionInInitializerError(th);
    	  }
        return sessionFactory;
    }

    public static void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtil.sessionFactory = sessionFactory;
    }
}
