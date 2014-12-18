package com.restaurants.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.restaurants.entity.RestaurantsEntity;
import com.restaurants.info.Restaurants;

@Repository
public class RestaurantsHibernateDAO extends BaseHibernateDAO implements
		RestaurantsDAO {

	@Override
	public void addRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub

		Session session = getSession();
		session.beginTransaction();
		session.save(session);

	}

	@Override
	public void deleteRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<RestaurantsEntity> searchRestaurants(Restaurants restaurants) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RestaurantsEntity> getAllRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}

}
