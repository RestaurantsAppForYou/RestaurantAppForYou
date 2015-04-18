package com.component.entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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

import com.component.entity.AddressEntity;
import com.component.entity.LocationEntity;

@Entity
@Inheritance
public class RestaurantsEntity extends ComponentEntity {

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity address;

	@Embedded
	private LocationEntity restaurantLocation;

	@Column(name = "RESTAURANT_TYPE")
	private boolean vegitarian;

	
	@ElementCollection
	@JoinTable(	name = "HoursOfOperationEntity",
				joinColumns= @JoinColumn(name="component_id")
			)
	private Set<HoursOfOperationEntity> hoursOfOperationEntity = new HashSet<HoursOfOperationEntity>();

	public AddressEntity getAddressId() {
		return address;
	}

	public void setAddressId(AddressEntity addressId) {
		this.address = addressId;
	}

	public LocationEntity getRestaurantLocation() {
		return restaurantLocation;
	}

	public void setRestaurantLocation(LocationEntity restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}

	public AddressEntity getAddress() {
		return address;
	}

	public void setAddress(AddressEntity address) {
		this.address = address;
	}

	public boolean isVegitarian() {
		return vegitarian;
	}

	public void setVegitarian(boolean vegitarian) {
		this.vegitarian = vegitarian;
	}
	

	public Set<HoursOfOperationEntity> getHoursOfOperationEntity() {
		return hoursOfOperationEntity;
	}

	public void setHoursOfOperationEntity(
			Set<HoursOfOperationEntity> hoursOfOperationEntity) {
		this.hoursOfOperationEntity = hoursOfOperationEntity;
	}

	@Override
	public String toString() {
		return "RestaurantsEntity [address=" + address
				+ ", restaurantLocation=" + restaurantLocation
				+ ", vegitarian=" + vegitarian + ", hoursOfOperationEntity="
				+ hoursOfOperationEntity + "]";
	}
}
