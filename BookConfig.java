package com.Hibernate.BookApp.util;



import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.Hibernate.BookApp.model.Book;


public class BookConfig {
	private static SessionFactory sf;
	@SuppressWarnings("deprecation")
	public static SessionFactory method1() {
		if(sf==null) {
			Configuration cfg=new Configuration();
			
			Properties p=new Properties();
			p.setProperty(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
			p.setProperty(Environment.URL,"jdbc:mysql://localhost:3306/BookStore");
			p.setProperty(Environment.USER,"root");
			p.setProperty(Environment.PASS,"shraddha");
			p.setProperty(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
			p.setProperty(Environment.HBM2DDL_AUTO,"create");
			p.setProperty(Environment.SHOW_SQL,"true");
			
			cfg.setProperties(p).addAnnotatedClass(Book.class);
			
			//ServiceRegistry sr=new StandardServiceRegistryBuilder().applySetting(null, p); 
			
			sf=cfg.buildSessionFactory();
			
			
			
		}
		
		return sf;
	}

}

