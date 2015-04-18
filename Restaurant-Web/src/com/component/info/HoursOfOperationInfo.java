package com.component.info;

import java.io.Serializable;
import java.sql.Time;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.component.entity.HoursOfOperationEntity;
import com.component.exceptions.FieldCheckExceptions;

/**
 * @author KYedavilli
 *
 */
public class HoursOfOperationInfo implements Serializable {/*

	*//**
	 * 
	 */
	private static final long serialVersionUID = 292596955069302104L;
	/*
	private static final long serialVersionUID = -3494434562495542479L;

	private long elementId;
	private String dayType;
	private String mondayStartTime;
	private String tuesdayStartTime;
	private String wednesdayStartTime;
	private String thursdayStartTime;
	private String fridayStartTime;
	private String saturdayStartTime;
	private String sundayStartTime;

	// end time

	private String mondayEndTime;
	private String tuesdayEndTime;
	private String wednesdayEndTime;
	private String thursdayEndTime;
	private String fridayEndTime;
	private String saturdayEndTime;
	private String sundayEndTime;

	private ComponentInfo componentInfo;

	private Set<HoursOfOperationEntity> hoursOfOperationEntityList;

	public HoursOfOperationInfo() {
	}

	public long getElementId() {
		return elementId;
	}

	public void setElementId(long elementId) {
		this.elementId = elementId;
	}

	public String getTuesdayStartTime() {
		if (null!=tuesdayStartTime)
		return tuesdayStartTime;
		else
			return null;
	}

	public void setTuesdayStartTime(String tuesdayStartTime) {
		this.tuesdayStartTime = tuesdayStartTime;
	}

	public String getFridayStartTime() {
		return fridayStartTime;
	}

	public void setFridayStartTime(String fridayStartTime) {
		this.fridayStartTime = fridayStartTime;
	}

	public String getSaturdayStartTime() {
		return saturdayStartTime;
	}

	public void setSaturdayStartTime(String saturdayStartTime) {
		this.saturdayStartTime = saturdayStartTime;
	}

	public String getSundayStartTime() {
		return sundayStartTime;
	}

	public void setSundayStartTime(String sundayStartTime) {
		this.sundayStartTime = sundayStartTime;
	}

	public ComponentInfo getComponentInfo() {
		return componentInfo;
	}

	public void setComponentInfo(ComponentInfo componentInfo) {
		this.componentInfo = componentInfo;
	}

	public Set<HoursOfOperationEntity> getHoursOfOperationEntityList() {
		if (null != hoursOfOperationEntityList) {
			return hoursOfOperationEntityList;
		} else {
			hoursOfOperationEntityList = new HashSet<HoursOfOperationEntity>();
		}

		return hoursOfOperationEntityList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDayType() {
		return dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getMondayStartTime() {
		return mondayStartTime;
	}

	public void setMondayStartTime(String mondayStartTime) {
		this.mondayStartTime = mondayStartTime;
	}

	public String getWednesdayStartTime() {
		return wednesdayStartTime;
	}

	public void setWednesdayStartTime(String wednesdayStartTime) {
		this.wednesdayStartTime = wednesdayStartTime;
	}

	public String getThursdayStartTime() {
		return thursdayStartTime;
	}

	public void setThursdayStartTime(String thursdayStartTime) {
		this.thursdayStartTime = thursdayStartTime;
	}

	public String getMondayEndTime() {
		return mondayEndTime;
	}

	public void setMondayEndTime(String mondayEndTime) {
		this.mondayEndTime = mondayEndTime;
	}

	public String getTuesdayEndTime() {
		return tuesdayEndTime;
	}

	public void setTuesdayEndTime(String tuesdayEndTime) {
		this.tuesdayEndTime = tuesdayEndTime;
	}

	public String getWednesdayEndTime() {
		return wednesdayEndTime;
	}

	public void setWednesdayEndTime(String wednesdayEndTime) {
		this.wednesdayEndTime = wednesdayEndTime;
	}

	public String getThursdayEndTime() {
		return thursdayEndTime;
	}

	public void setThursdayEndTime(String thursdayEndTime) {
		this.thursdayEndTime = thursdayEndTime;
	}

	public String getFridayEndTime() {
		return fridayEndTime;
	}

	public void setFridayEndTime(String fridayEndTime) {
		this.fridayEndTime = fridayEndTime;
	}

	public String getSaturdayEndTime() {
		return saturdayEndTime;
	}

	public void setSaturdayEndTime(String saturdayEndTime) {
		this.saturdayEndTime = saturdayEndTime;
	}

	public String getSundayEndTime() {
		return sundayEndTime;
	}

	public void setSundayEndTime(String sundayEndTime) {
		this.sundayEndTime = sundayEndTime;
	}

	public ComponentInfo getComponentEntity() {
		return componentInfo;
	}

	public void setComponentEntity(ComponentInfo componentInfo) {
		this.componentInfo = componentInfo;
	}

	public ComponentInfo getRestaurantEntity() {
		return componentInfo;
	}

	@Override
	public String toString() {
		return "HoursOfOperationInfo [elementId=" + elementId + ", dayType="
				+ dayType + ", mondayStartTime=" + mondayStartTime
				+ ", tuesdayStartTime=" + tuesdayStartTime
				+ ", wednesdayStartTime=" + wednesdayStartTime
				+ ", thursdayStartTime=" + thursdayStartTime
				+ ", fridayStartTime=" + fridayStartTime
				+ ", saturdayStartTime=" + saturdayStartTime
				+ ", sundayStartTime=" + sundayStartTime + ", mondayEndTime="
				+ mondayEndTime + ", tuesdayEndTime=" + tuesdayEndTime
				+ ", wednesdayEndTime=" + wednesdayEndTime
				+ ", thursdayEndTime=" + thursdayEndTime + ", fridayEndTime="
				+ fridayEndTime + ", saturdayEndTime=" + saturdayEndTime
				+ ", sundayEndTime=" + sundayEndTime + ", componentInfo="
				+ componentInfo + ", hoursOfOperationEntityList="
				+ hoursOfOperationEntityList + "]";
	}

*/

	private String key;
	private Set<String> value;

	private String dayType;

	private Set<HoursOfOperationEntity> hoursOfOperationEntityList;

	public Set<HoursOfOperationEntity> getHoursOfOperationEntityList() {

		return hoursOfOperationEntityList;
	}

	public String getDayType() {
		return dayType;
	}

	public void setDayType(String dayType) {
		this.dayType = dayType;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Set<String> getValue() {
		return value;
	}

	public void setValue(Set<String> value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "HoursOfOperationInfo [key=" + key + ", value=" + value
				+ ", dayType=" + dayType + ", hoursOfOperationEntityList="
				+ hoursOfOperationEntityList + "]";
	}

}
