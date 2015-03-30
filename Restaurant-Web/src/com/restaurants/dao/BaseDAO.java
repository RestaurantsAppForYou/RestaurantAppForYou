package com.restaurants.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface BaseDAO {

	public SessionFactory getSessionFactory();
}
