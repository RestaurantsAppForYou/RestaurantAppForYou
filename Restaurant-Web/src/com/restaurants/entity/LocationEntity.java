package com.restaurants.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="location")
public class LocationEntity {
	@Id
	@Column(name="locationId")
	String Id;
	@Column
	String street;
	@Column
	String city;
	@Column
	String state;
	@Column
	Integer zipCode;
	@Column
	String contactDetails;
	
	public String getiD() {
		return Id;
	}

	public void setiD(String iD) {
		this.Id = iD;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Location [street=" + street + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + "]";
	}

}
