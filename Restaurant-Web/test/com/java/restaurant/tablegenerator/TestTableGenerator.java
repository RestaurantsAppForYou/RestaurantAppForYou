package com.java.restaurant.tablegenerator;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.component.commons.ElementTime;
import com.component.entity.AddressEntity;
import com.component.entity.LocationEntity;
import com.component.entity.RestaurantsEntity;
import com.component.entity.RestaurantsEntity.HoursOfOperation;
import com.component.entity.RestaurantsEntity.TypeOfRestaurant;

public class TestTableGenerator {

	public static void main(String[] args) {

		RestaurantsEntity restaurant = new RestaurantsEntity();
		AddressEntity address = new AddressEntity();
		address.setCity("Detroit");
		address.setContactDetails("1234567890");
		address.setState("MI");
		address.setStreet("DRAKE Road");
		address.setZipCode(48345);
		restaurant.setAddressId(address);

		restaurant.setName("AHAR");
		LocationEntity restaurantLocation = new LocationEntity();
		restaurantLocation.setLatitude(1011l);
		restaurantLocation.setLongitude(1011l);

		restaurant.setRestaurantLocation(restaurantLocation);
		restaurant.setName("AHAR");
		restaurant.setTypeOfRestaurant(TypeOfRestaurant.NON_VEGITARIAN);
		ElementTime elementTime = new ElementTime(new Time(7, 0, 0), new Time(
				10, 0, 0));
		HoursOfOperation hoursOfOperation = HoursOfOperation.BREAKFAST;

//		restaurant.getHoursOfOperation().add(hoursOfOperation);
		
		
		
		Map<HoursOfOperation, ElementTime> hoursOfOperationConfig = new HashMap<RestaurantsEntity.HoursOfOperation, ElementTime>();
		
		
		hoursOfOperationConfig.put(hoursOfOperation, elementTime);
		
		restaurant.setHoursOfOperationConfig(hoursOfOperationConfig);
		

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(restaurant);
		session.getTransaction().commit();
		session.close();

	}

}
