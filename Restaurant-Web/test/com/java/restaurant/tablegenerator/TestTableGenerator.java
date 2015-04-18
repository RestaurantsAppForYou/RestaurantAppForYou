package com.java.restaurant.tablegenerator;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.component.commons.DayType;
import com.component.entity.AddressEntity;
import com.component.entity.ComponentEntity;
import com.component.entity.DayTimeEntity;
import com.component.entity.HoursOfOperationEntity;
import com.component.entity.LocationEntity;
import com.component.entity.RestaurantsEntity;

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
		restaurant.setVegitarian(false);
		
//		restaurant.getHoursOfOperation().add(hoursOfOperation);
		
	
		
	
		
		
		
		HoursOfOperationEntity hoursOfOperationEntity = new HoursOfOperationEntity();
		
		hoursOfOperationEntity.setDayType(DayType.BREAKFAST.toString());
		hoursOfOperationEntity.setFridaystartTime("7:00 AM");
		hoursOfOperationEntity.setFridayEndTime("10:00 AM");
		
		hoursOfOperationEntity.setMondayStartTime("7:00 AM");
		hoursOfOperationEntity.setMondayEndTime("10:00 AM");
		
		hoursOfOperationEntity.setTuesdaystartTime("7:00 AM");
		hoursOfOperationEntity.setTuesdayEndTime("10:00 AM");
		
		hoursOfOperationEntity.setWednesdayStartTime("7:00 AM");
		hoursOfOperationEntity.setWednesdayEndTime("10:00 AM");
		
		hoursOfOperationEntity.setThursdayStartTime("7:00 AM");
		hoursOfOperationEntity.setThursdayEndTime("10:00 AM");
		
		hoursOfOperationEntity.setSaturdaystartTime("8:00 AM");
		hoursOfOperationEntity.setSaturdayEndTime("10:00 AM");
		
		hoursOfOperationEntity.setSundaystartTime("8:00 AM");
		hoursOfOperationEntity.setSundayEndTime("10:00 AM");
//		hoursOfOperationEntity.setComponentEntity(restaurant);
		
		
		
		
		
		HoursOfOperationEntity hoursOfOperationEntity2 = new HoursOfOperationEntity();
		
		hoursOfOperationEntity2.setDayType(DayType.LUNCH.toString());
		hoursOfOperationEntity2.setFridaystartTime("7:00 AM");
		hoursOfOperationEntity2.setFridayEndTime("10:00 AM");
		
		hoursOfOperationEntity2.setMondayStartTime("7:00 AM");
		hoursOfOperationEntity.setMondayEndTime("10:00 AM");
		
		hoursOfOperationEntity2.setTuesdaystartTime("7:00 AM");
		hoursOfOperationEntity2.setTuesdayEndTime("10:00 AM");
		
		hoursOfOperationEntity2.setWednesdayStartTime("7:00 AM");
		hoursOfOperationEntity2.setWednesdayEndTime("10:00 AM");
		
		hoursOfOperationEntity2.setThursdayStartTime("7:00 AM");
		hoursOfOperationEntity2.setThursdayEndTime("10:00 AM");
		
		hoursOfOperationEntity2.setSaturdaystartTime("8:00 AM");
		hoursOfOperationEntity2.setSaturdayEndTime("10:00 AM");
		
		hoursOfOperationEntity2.setSundaystartTime("8:00 AM");
		hoursOfOperationEntity2.setSundayEndTime("10:00 AM");
		
//		hoursOfOperationEntity2.setComponentEntity(restaurant);
		
		
	Set<HoursOfOperationEntity> hoursOfOperationEntityList = new HashSet<HoursOfOperationEntity>();
	hoursOfOperationEntityList.add(hoursOfOperationEntity);
	hoursOfOperationEntityList.add(hoursOfOperationEntity2);
		restaurant.setHoursOfOperationEntity(hoursOfOperationEntityList);;
		

		SessionFactory sf = new Configuration().configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(restaurant);
		session.getTransaction().commit();
		session.close();
		
		}
}
