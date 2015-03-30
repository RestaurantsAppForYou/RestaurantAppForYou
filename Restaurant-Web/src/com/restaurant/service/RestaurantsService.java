package com.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurants.dao.RestaurantsDAO;
import com.restaurants.entity.RestaurantsEntity;

@Service
public class RestaurantsService implements RestaurantsServiceInterface{

	@Autowired
	private RestaurantsDAO restaurantsDAO; 
	
	@Override
	public List<RestaurantsEntity> getAllRestaurants() {
		// TODO Auto-generated method stub
		
		List<RestaurantsEntity> listOdRestaurants =	restaurantsDAO.getAllRestaurants();
		
		return listOdRestaurants;
	}

}
