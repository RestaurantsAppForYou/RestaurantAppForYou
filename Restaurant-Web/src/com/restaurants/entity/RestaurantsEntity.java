package com.restaurants.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="restaurant")
public class RestaurantsEntity {

	@Id
	@Column
	String restaurantID;
	@Column
	String name;
	@ManyToOne(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name="locationId")
	LocationEntity location;
//	@Column
	transient String rating;
	@Column
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
