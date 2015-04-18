package com.java.restaurant.tablegenerator;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.component.entity.HoursOfOperationEntity;
import com.component.entity.RestaurantsEntity;

public class EnumTest {

	
	public static void main(String[] args) {
		
		RestaurantsEntity restaurantsEntity = new RestaurantsEntity();		
	
		Map<HoursOfOperationEntity, HoursOfOperationEntity> hoursOfOperationConfig = new HashMap<HoursOfOperationEntity,HoursOfOperationEntity>();
		
		HoursOfOperationEntity hoursOfOperation = HoursOfOperationEntity.BREAKFAST;
		HoursOfOperationEntity hoursOfOperation2 = HoursOfOperationEntity.BRUNCH;
		
		Time startTime = new Time(2,0,0);
		Time endTime = new Time(1,0,0);
		
		HoursOfOperationEntity elementTime = new HoursOfOperationEntity(startTime, endTime);
		
		
		Time startTime2 = new Time(4,0,0);
		Time endTime2 = new Time(5,0,0);
		
		HoursOfOperationEntity elementTime2 = new HoursOfOperationEntity(startTime2, endTime2);
//		hoursOfOperationConfig.put(hoursOfOperation, elementTime);
		
//		restaurantsEntity.setHoursOfOperation(hoursOfOperationConfig);
		
		
		System.out.println("Name" + restaurantsEntity.getHoursOfOperation()  +"    ");
		
			
//			System.out.print("Start" + restaurantsEntity.getHoursOfOperation().get(0).getElementTime().getStartTime());
//			System.out.print("End" + restaurantsEntity.getHoursOfOperation().get(0).getElementTime().getEndTime());
			
			hoursOfOperation.setStartAndEndTime(elementTime);
			hoursOfOperation2.setStartAndEndTime(elementTime2);
			restaurantsEntity.getHoursOfOperation().add(hoursOfOperation);
			restaurantsEntity.getHoursOfOperation().add(hoursOfOperation2);
			System.out.println("Name" + restaurantsEntity.getHoursOfOperation().get(0)  +"    ");
			System.out.print("Start" + restaurantsEntity.getHoursOfOperation().get(0).getElementTime().getStartTime());
			System.out.println("End" + restaurantsEntity.getHoursOfOperation().get(0).getElementTime().getEndTime());
			System.out.println("Name" + restaurantsEntity.getHoursOfOperation().get(1)  +"    ");
			System.out.print("Start" + restaurantsEntity.getHoursOfOperation().get(1).getElementTime().getStartTime());
			System.out.print("End" + restaurantsEntity.getHoursOfOperation().get(1).getElementTime().getEndTime());
	
		
	}
	
}
