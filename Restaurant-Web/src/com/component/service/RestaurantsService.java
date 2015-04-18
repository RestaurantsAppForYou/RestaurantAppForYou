package com.component.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.component.dao.ComponentDAO;
import com.component.entity.ComponentEntity;
import com.component.entity.RestaurantsEntity;

@Service
public class RestaurantsService implements ComponentService {

	@Autowired
	private ComponentDAO restaurantsDAO;

	public List<ComponentEntity> getAllRestaurants() {

		List<ComponentEntity> listOdRestaurants = restaurantsDAO
				.getAllComponent();
		
		System.out.println("listOdRestaurants---------------->"+listOdRestaurants);

		return listOdRestaurants;
	}

	public List<ComponentEntity> getRestaurantsById(String iD) {

		List<ComponentEntity> listOdRestaurants = restaurantsDAO
				.searchComponent(iD);

		return listOdRestaurants;
	}

	@Override
	public List<ComponentEntity> getAllComponents() {

		List<ComponentEntity> listOfComponents =getAllRestaurants();
		
		System.out.println("listOfComponents::++++++++++++++++++++++"+listOfComponents);
		
		return listOfComponents;
	}

	@Override
	public List<ComponentEntity> getComponentsById(String Id) {

		List<ComponentEntity> listOfComponents =getRestaurantsById(Id);
		
		return null;
	}

}
