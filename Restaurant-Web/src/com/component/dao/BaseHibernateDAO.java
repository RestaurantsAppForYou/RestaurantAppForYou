package com.component.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.component.dao.BaseDAO;

public class BaseHibernateDAO implements BaseDAO {

	@Override
	public SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();
		return sessionFactory;
	}

}
