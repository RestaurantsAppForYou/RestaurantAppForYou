package com.component.utils;

import java.util.ArrayList;
import java.util.List;

import com.component.entity.ComponentEntity;
import com.component.entity.RestaurantsEntity;
import com.component.info.Address;
import com.component.info.ComponentInfo;
import com.component.info.Restaurants;

public class TranslatorUtil {

	public static List<ComponentInfo> getRestaurantsTranslator(
			List<ComponentEntity> componentEntityList) {
		List<ComponentInfo> componentInfoList = new ArrayList<ComponentInfo>();

		for (ComponentEntity componentEntity : componentEntityList) {
			Restaurants restaurants = new Restaurants();

			if (componentEntity instanceof RestaurantsEntity) {

				RestaurantsEntity restaurantEntity = (RestaurantsEntity) componentEntity;

				// Address Details Translation
				Address restaurantAddress = new Address();
				restaurantAddress.setCity(restaurantEntity.getAddress()
						.getCity());
				restaurantAddress.setContactDetails(restaurantEntity
						.getAddress().getContactDetails());
				restaurantAddress.setState(restaurantEntity.getAddress()
						.getState());
				restaurantAddress.setStreet(restaurantEntity.getAddress()
						.getStreet());
				restaurantAddress.setZipCode(restaurantEntity.getAddress()
						.getZipCode());

				// Restaurant details Translation
				// restaurants.setHoursOfOperation(restaurantsEntity
				// .getHoursOfOperation());
				restaurants.setAddress(restaurantAddress);
				restaurants.setName(restaurantEntity.getName());
				componentInfoList.add(restaurants);
			}
		}
		return componentInfoList;
	}

}
