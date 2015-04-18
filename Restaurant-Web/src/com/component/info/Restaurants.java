package com.component.info;

import java.util.HashSet;
import java.util.List;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import com.component.entity.AddressEntity;
import com.component.entity.ComponentEntity;
import com.component.entity.HoursOfOperationEntity;
import com.component.entity.LocationEntity;
import com.component.info.Address;
import com.component.info.Location;

public class Restaurants extends ComponentInfo {

	private Address address;

	private Location restaurantLocation;

	private boolean vegitarian;

	private Set<HoursOfOperationInfo> hoursOfOperations;

	public Set<HoursOfOperationInfo> getHoursOfOperations() {

		hoursOfOperations = (null == hoursOfOperations) ? new HashSet<HoursOfOperationInfo>()
				: hoursOfOperations;

		return hoursOfOperations;
	}

	
	
	public void setHoursOfOperations(Set<HoursOfOperationInfo> hoursOfOperations) {
		this.hoursOfOperations = hoursOfOperations;
	}



	public Address getAddressId() {
		return address;
	}

	public void setAddressId(Address addressId) {
		this.address = addressId;
	}

	public Location getRestaurantLocation() {
		return restaurantLocation;
	}

	public void setRestaurantLocation(Location restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isVegitarian() {
		return vegitarian;
	}

	public void setVegitarian(boolean vegitarian) {
		this.vegitarian = vegitarian;
	}

	@Override
	public String toString() {
		return "Restaurants [address=" + address + ", restaurantLocation="
				+ restaurantLocation + ", vegitarian=" + vegitarian + "]";
	}
}
