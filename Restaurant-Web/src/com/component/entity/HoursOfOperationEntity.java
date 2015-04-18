package com.component.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.component.exceptions.FieldCheckExceptions;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author KYedavilli
 *
 */
@Embeddable
@Table(name="HoursOfOperationEntity")
public class HoursOfOperationEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3494434562495542479L;

	/*@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "elementId")*/
//	private long elementId;
	@Column(name = "DAYTYPE")
	@JsonIgnore
	private String dayType;
	@Column(name = "MONDAYSTARTTIME")
	private String mondayStartTime;
	@Column(name = "TUESDAYSTARTTIME")
	private String tuesdayStartTime;
	@Column(name = "WEDNESDAYSTARTTIME")
	private String wednesdayStartTime;
	@Column(name = "THURSDAYSTARTTIME")
	private String thursdayStartTime;
	@Column(name = "FRIDAYSTARTTIME")
	private String fridayStartTime;
	@Column(name = "SATURDAYSTARTTIME")
	private String saturdayStartTime;
	@Column(name = "SUNDAYSTARTTIME")
	private String sundayStartTime;

	// end time

	@Column(name = "MONDAYENDTIME")
	private String mondayEndTime;
	@Column(name = "TUESDAYENDTIME")
	private String tuesdayEndTime;
	@Column(name = "WEDNESDAYENDTIME")
	private String wednesdayEndTime;
	@Column(name = "THURSDAYENDTIME")
	private String thursdayEndTime;
	@Column(name = "FRIDAYENDTIME")
	private String fridayEndTime;
	@Column(name = "SATURDAYENDTIME")
	private String saturdayEndTime;
	@Column(name = "SUNDAYENDTIME")
	private String sundayEndTime;

	/*@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "component_id")
	private ComponentEntity componentEntity;*/

	public HoursOfOperationEntity() {

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

	public String getTuesdayStartTime() {
		return tuesdayStartTime;
	}

	public void setTuesdaystartTime(String tuesdaystartTime) {
		this.tuesdayStartTime = tuesdaystartTime;
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

	public String getFridayStartTime() {
		return fridayStartTime;
	}

	public void setFridaystartTime(String fridaystartTime) {
		this.fridayStartTime = fridaystartTime;
	}

	public String getSaturdayStartTime() {
		return saturdayStartTime;
	}

	public void setSaturdaystartTime(String saturdaystartTime) {
		this.saturdayStartTime = saturdaystartTime;
	}

	public String getSundayStartTime() {
		return sundayStartTime;
	}

	public void setSundaystartTime(String sundaystartTime) {
		this.sundayStartTime = sundaystartTime;
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

/*	public ComponentEntity getComponentEntity() {
		return componentEntity;
	}

	public void setComponentEntity(ComponentEntity componentEntity) {
		this.componentEntity = componentEntity;
	}*/

	@Override
	public String toString() {
		return "HoursOfOperationEntity [dayType=" + dayType
				+ ", mondayStartTime=" + mondayStartTime
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
				+ ", sundayEndTime=" + sundayEndTime + "]";
	}

}
