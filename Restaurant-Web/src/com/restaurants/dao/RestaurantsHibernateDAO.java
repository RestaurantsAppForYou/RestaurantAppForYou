package com.restaurants.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.restaurants.entity.RestaurantsEntity;
import com.restaurants.info.Restaurants;

@Repository
public class RestaurantsHibernateDAO extends BaseHibernateDAO implements
		RestaurantsDAO {

	@Override
	public void addRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(session);
		session.getTransaction().commit();
	}

	@Override
	public void deleteRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<RestaurantsEntity> searchRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub
		List<RestaurantsEntity> listOfRestaurants = new ArrayList<RestaurantsEntity>();
		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		listOfRestaurants = (List<RestaurantsEntity>) session
				.get(RestaurantsEntity.class, restaurants.getLocation()
						.getZipCode());
		session.getTransaction().commit();

		
		return listOfRestaurants;
	}

	@Override
	public List<RestaurantsEntity> getAllRestaurants() {
		// TODO Auto-generated method stub

		List<RestaurantsEntity> listOfAllRestaurants = new ArrayList<RestaurantsEntity>();
		SessionFactory sessionFactory = getSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		listOfAllRestaurants = (List<RestaurantsEntity>) session
				.createCriteria(RestaurantsEntity.class).list();
		session.getTransaction().commit();
		System.out.println("list of Restaurants"+listOfAllRestaurants);
		return listOfAllRestaurants;
	}

}
