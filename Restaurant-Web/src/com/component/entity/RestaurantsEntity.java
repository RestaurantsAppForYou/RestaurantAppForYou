package com.component.entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionType;
import org.springframework.beans.factory.annotation.Autowired;

import com.component.commons.ElementTime;
import com.component.commons.HoursOfOperation;
import com.component.entity.AddressEntity;
import com.component.entity.LocationEntity;

@Entity
@Inheritance
public class RestaurantsEntity extends ComponentEntity {

	public enum TypeOfRestaurant {
		VEGITARIAN, NON_VEGITARIAN
	}

	public enum HoursOfOperation {

		BREAKFAST, BRUNCH, LUNCH, DINNER, OPENTOCLOSE;
	}

	@OneToOne(cascade = CascadeType.ALL)
	private AddressEntity address;

	@MapKeyEnumerated(EnumType.STRING)
	@ElementCollection(fetch = FetchType.LAZY)
	@JoinTable(	name = "OPERATING_HOURS", 
				joinColumns = @JoinColumn(name = "component_id")
	)
	private Map<HoursOfOperation, ElementTime> hoursOfOperationConfig; //

	// //only
	// setter
	// no
	// getter

	// @ElementCollection()
	// private List<HoursOfOperation> hoursOfOperation;

	// private Map<>

	@Column(name = "RESTAURANT_TYPE")
	private TypeOfRestaurant typeOfRestaurant;

	@Embedded
	private LocationEntity restaurantLocation;

	public AddressEntity getAddressId() {
		return address;
	}

	public void setAddressId(AddressEntity addressId) {
		this.address = addressId;
	}

	/*
	 * public List<HoursOfOperation> getHoursOfOperation() {
	 * 
	 * if (null != hoursOfOperation) {
	 * 
	 * return hoursOfOperation; } else return hoursOfOperation = new
	 * ArrayList<HoursOfOperation>();
	 * 
	 * }
	 */
	public LocationEntity getRestaurantLocation() {
		return restaurantLocation;
	}

	public void setRestaurantLocation(LocationEntity restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}

	public TypeOfRestaurant getTypeOfRestaurant() {
		return typeOfRestaurant;
	}

	public void setTypeOfRestaurant(TypeOfRestaurant typeOfRestaurant) {
		this.typeOfRestaurant = typeOfRestaurant;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public Map<HoursOfOperation, ElementTime> getHoursOfOperationConfig() {
		return hoursOfOperationConfig;
	}

	public void setHoursOfOperationConfig(
			Map<HoursOfOperation, ElementTime> hoursOfOperationConfig) {
		this.hoursOfOperationConfig = hoursOfOperationConfig;
	}

	@Override
	public String toString() {
		return "RestaurantsEntity [address=" + address
				+ ", hoursOfOperationConfig=" + hoursOfOperationConfig
				+ ", typeOfRestaurant=" + typeOfRestaurant
				+ ", restaurantLocation=" + restaurantLocation + "]";
	}
}
