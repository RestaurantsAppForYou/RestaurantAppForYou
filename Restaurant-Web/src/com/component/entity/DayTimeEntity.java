package com.component.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.component.commons.DayType;
import com.fasterxml.jackson.databind.AnnotationIntrospector.ReferenceProperty.Type;

public class DayTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long datTimeId;

	@Column
	@Enumerated(EnumType.STRING)
	private DayType dayType;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "component_id")
	private ComponentEntity componentEntity;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "elementId")
	private HoursOfOperationEntity elementTime;


	
	public DayType getDayType() {
		return dayType;
	}

	public void setDayType(DayType dayType) {
		this.dayType = dayType;
	}

	public long getDatTimeId() {
		return datTimeId;
	}

	public void setDatTimeId(long datTimeId) {
		this.datTimeId = datTimeId;
	}

	public ComponentEntity getComponentEntity() {
		return componentEntity;
	}

	public void setComponentEntity(ComponentEntity componentEntity) {
		this.componentEntity = componentEntity;
	}

	public HoursOfOperationEntity getElementTime() {
		return elementTime;
	}

	public void setElementTime(HoursOfOperationEntity elementTime) {
		this.elementTime = elementTime;
	}

	@Override
	public String toString() {
		return "DayTimeEntity [datTimeId=" + datTimeId + ", dayType=" + dayType
				+ ", componentEntity=" + componentEntity + ", elementTime="
				+ elementTime + "]";
	}

}
