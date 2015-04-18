package com.component.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.component.entity.ComponentEntity;
import com.component.entity.HoursOfOperationEntity;
import com.component.entity.RestaurantsEntity;
import com.component.info.Address;
import com.component.info.ComponentInfo;
import com.component.info.HoursOfOperationInfo;
import com.component.info.Location;
import com.component.info.Restaurants;

public class TranslatorUtil {

	/**
	 * This method will translate the RestaurantEntity to Restaurant
	 * 
	 * @param restaurantEntity
	 * @return componentEntityList
	 * 
	 */
	public static List<ComponentInfo> getRestaurantsTranslator(
			List<ComponentEntity> restaurantsEntityList) {
		List<ComponentInfo> componenetInfoList = new ArrayList<ComponentInfo>();

		Restaurants restaurants = new Restaurants();

		for (ComponentEntity componentEntity : restaurantsEntityList) {

			if (componentEntity instanceof RestaurantsEntity) {

				RestaurantsEntity restaurantEntity = (RestaurantsEntity) componentEntity;

				// Setting up address
				Address address = new Address();
				address.setCity(restaurantEntity.getAddress().getCity());
				address.setContactDetails(restaurantEntity.getAddress()
						.getContactDetails());
				address.setState(restaurantEntity.getAddress().getState());
				address.setStreet(restaurantEntity.getAddress().getStreet());
				address.setZipCode(restaurantEntity.getAddress().getZipCode());

				restaurants.setiD(restaurantEntity.getiD());
				restaurants.setName(restaurantEntity.getName());
				restaurants.setAddress(address);

				// Restaurant Location
				Location restaurantLocation = new Location();
				restaurantLocation.setLatitude(restaurantEntity
						.getRestaurantLocation().getLatitude());
				restaurantLocation.setLongitude(restaurantEntity
						.getRestaurantLocation().getLongitude());

				restaurants.setRestaurantLocation(restaurantLocation);
				componenetInfoList.add(restaurants);

				restaurants
						.setHoursOfOperations(getHoursOfOperation(restaurantEntity
								.getHoursOfOperationEntity()));

			}
		}
		return componenetInfoList;
	}

	public static Set<HoursOfOperationInfo> getHoursOfOperation(
			Set<HoursOfOperationEntity> hoursOfOperationEntitySet) {

		Set<HoursOfOperationInfo> hoursOfOperationInfoSet = new HashSet<HoursOfOperationInfo>();
		HoursOfOperationInfo hoursOfOperationInfo = null;
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		for (HoursOfOperationEntity hoursOfOperationEntity : hoursOfOperationEntitySet) {

			hoursOfOperationInfo = new HoursOfOperationInfo();

			Set<String> listOfTime = new HashSet<String>();

			hoursOfOperationInfo
					.setDayType(hoursOfOperationEntity.getDayType());

			switch (day) {

			case Calendar.MONDAY:

				hoursOfOperationInfo.setKey("MONDAY");

				hoursOfOperationInfo.setValue(listOfTime);

				listOfTime.add(hoursOfOperationEntity.getMondayStartTime());
				listOfTime.add(hoursOfOperationEntity.getMondayEndTime());
				break;

			case Calendar.TUESDAY:
				hoursOfOperationInfo.setKey("TUESDAY");

				hoursOfOperationInfo.setValue(listOfTime);
				listOfTime.add(hoursOfOperationEntity.getTuesdayStartTime());
				listOfTime.add(hoursOfOperationEntity.getTuesdayEndTime());
				break;

			case Calendar.WEDNESDAY:
				hoursOfOperationInfo.setKey("WEDNESDAY");

				hoursOfOperationInfo.setValue(listOfTime);

				listOfTime.add(hoursOfOperationEntity.getWednesdayStartTime());
				listOfTime.add(hoursOfOperationEntity.getWednesdayEndTime());
				break;

			case Calendar.THURSDAY:
				hoursOfOperationInfo.setKey("THURSDAY");

				hoursOfOperationInfo.setValue(listOfTime);

				listOfTime.add(hoursOfOperationEntity.getThursdayStartTime());
				listOfTime.add(hoursOfOperationEntity.getThursdayEndTime());
				break;

			case Calendar.FRIDAY:
				hoursOfOperationInfo.setKey("FRIDAY");

				hoursOfOperationInfo.setValue(listOfTime);

				listOfTime.add(hoursOfOperationEntity.getFridayStartTime());
				listOfTime.add(hoursOfOperationEntity.getFridayEndTime());
				break;

			case Calendar.SATURDAY:
				hoursOfOperationInfo.setKey("SATURDAY");

				hoursOfOperationInfo.setValue(listOfTime);

				listOfTime.add(hoursOfOperationEntity.getSaturdayStartTime());
				listOfTime.add(hoursOfOperationEntity.getSaturdayEndTime());
				break;

			case Calendar.SUNDAY:
				hoursOfOperationInfo.setKey("SUNDAY");

				hoursOfOperationInfo.setValue(listOfTime);

				listOfTime.add(hoursOfOperationEntity.getSundayStartTime());
				listOfTime.add(hoursOfOperationEntity.getSundayEndTime());
				break;

			default:
				hoursOfOperationInfo.getHoursOfOperationEntityList().add(
						hoursOfOperationEntity);
			}

			hoursOfOperationInfoSet.add(hoursOfOperationInfo);

		}

		return hoursOfOperationInfoSet;

	}

}
