package com.component.commons;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.component.exceptions.FieldCheckExceptions;

@Embeddable
public class ElementTime {

	@Column
	private Time startTime;
	@Column
	private Time endTime;
	
	private ElementTime(){
		
	}

	public ElementTime(Time startTime, Time endTime) {
		
		if (startTime.getTime() > endTime.getTime()) {
			this.endTime = startTime;
			this.startTime = endTime;
		} else if (startTime.getTime() < endTime.getTime()) {
			this.endTime = endTime;
			this.startTime = startTime;
		} else
			throw new FieldCheckExceptions("Invalid startDate and endDate");

	}

	public Time getStartTime() {
		return startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

}
