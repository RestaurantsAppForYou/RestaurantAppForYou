package com.component.utils;

import java.beans.Expression;
import java.beans.Statement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.component.entity.RestaurantsEntity;
import com.component.info.Address;
import com.component.info.Restaurants;

public class Translator {

	public static Restaurants restaurantTranslator(
			RestaurantsEntity restaurantsEntity) throws Exception {

		Restaurants restaurants = new Restaurants();

		Method[] methods = restaurantsEntity.getClass().getDeclaredMethods();
		Method[] methodsE = restaurants.getClass().getDeclaredMethods();

		Map<Object, Object> setgetMap = new TreeMap<Object, Object>();

		List<String> list = new ArrayList<String>();

		Expression exp;

		for (Method method : methods) {

			// Getting all the setters and getters from the POJO
			if ("set".equalsIgnoreCase(method.getName().substring(0, 3))
					|| "get".equalsIgnoreCase(method.getName().substring(0, 3))
					|| "is".equalsIgnoreCase(method.getName().substring(0, 2))) {

				if ("get".equalsIgnoreCase(method.getName().substring(0, 3))) {

					exp = new Expression(restaurantsEntity, method.getName(),
							new Object[0]);
					exp.execute();

					setgetMap.put(method.getName(), exp.getValue());
				}
				
				
				
			}
		}

		setgetMap.entrySet();

		for (Method method : methodsE) {

			if ("set".equalsIgnoreCase(method.getName().substring(0, 3))
					|| "is".equalsIgnoreCase(method.getName().substring(0, 2))) {
				list.add(method.getName());
			}

			Collections.sort(list);
		}
int i=0;
		for (Map.Entry<Object, Object> entry : setgetMap.entrySet()) {

			System.out.println();
			System.out.println("key value : " +entry.getKey() + " : " + entry.getValue());

			System.out.println("List : "+list.get(i));
			Statement stmt;
			stmt = new Statement(restaurants, list.get(i), new Object[] {entry.getValue()});
			stmt.execute();
			i++;
			System.out.println("statement : "+stmt.getTarget());
		}

		

		/*	
		 * // Address Details Translation
		 * restaurantAddress.setCity(restaurantsEntity.getLocation().getCity());
		 * restaurantAddress.setContactDetails(restaurantsEntity.getLocation()
		 * .getContactDetails());
		 * restaurantAddress.setState(restaurantsEntity.getLocation
		 * ().getState()); restaurantAddress
		 * .setStreet(restaurantsEntity.getLocation().getStreet());
		 * restaurantAddress.setZipCode(restaurantsEntity.getLocation()
		 * .getZipCode());
		 * 
		 * // Restaurant details Translation restaurants
		 * .setHoursOfOperation(restaurantsEntity.getHoursOfOperation());
		 * restaurants.setAddress(restaurantAddress);
		 * restaurants.setName(restaurantsEntity.getName());
		 */

		return restaurants;

	}

	/*
	 * private boolean filteringGetsSets(Object obj){
	 * 
	 * 
	 * }
	 */

/*	public static void main(String[] args) throws Exception {

		RestaurantsEntity restaurants = new RestaurantsEntity();

		restaurantTranslator(restaurants);
	}*/
}
