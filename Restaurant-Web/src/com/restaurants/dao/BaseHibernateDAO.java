package com.restaurants.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseHibernateDAO implements BaseDAO {

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		return sessionFactory.openSession();
	}

}
