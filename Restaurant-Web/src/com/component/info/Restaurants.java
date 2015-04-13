package com.component.info;

import java.util.Date;

import com.component.info.Address;
import com.component.info.Location;

public class Restaurants extends ComponentInfo{

	String restaurantID;
	String name;
	Address address;
	Date startTime;
	Location restaurantLocation;

	public String getRestaurantID() {
		return restaurantID;
	}

	public void setRestaurantID(String restaurantID) {
		this.restaurantID = restaurantID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Location getRestaurantLocation() {
		return restaurantLocation;
	}

	public void setRestaurantLocation(Location restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}

	@Override
	public String toString() {
		return "Restaurants [restaurantID=" + restaurantID + ", name=" + name
				+ ", address=" + address + ", hoursOfOperation="
				+ startTime + ", location=" + restaurantLocation + "]";
	}

}
