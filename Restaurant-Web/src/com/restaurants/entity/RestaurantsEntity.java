package com.restaurants.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RestaurantsEntity {

	@Id
	String restaurantID;
	String name;
	LocationEntity location;
	String rating;
	String hoursOfOperation;

	
	
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

	public LocationEntity getLocation() {
		return location;
	}

	public void setLocation(LocationEntity location) {
		this.location = location;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	public void setHoursOfOperation(String hoursOfOperation) {
		this.hoursOfOperation = hoursOfOperation;
	}

	@Override
	public String toString() {
		return "Restaurants [name=" + name + ", location=" + location
				+ ", rating=" + rating + "]";
	}

}
