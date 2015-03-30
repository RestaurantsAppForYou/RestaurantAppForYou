package com.restaurants.info;


public class Restaurants {

	String restaurantID;
	String name;
	Location location;
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

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
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
