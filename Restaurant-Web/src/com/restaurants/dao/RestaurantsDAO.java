package com.restaurants.dao;

import java.util.List;

import com.restaurants.entity.RestaurantsEntity;
import com.restaurants.info.Restaurants;

public interface RestaurantsDAO {

	void addRestaurants(Restaurants restaurants);
	void deleteRestaurants(Restaurants restaurants);
	List<RestaurantsEntity> searchRestaurants(Restaurants restaurants);
	List<RestaurantsEntity> getAllRestaurants();
	
}
	