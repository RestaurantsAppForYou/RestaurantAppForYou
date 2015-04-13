package com.component.commons;

import java.sql.Time;

import javax.persistence.Embedded;

import com.component.exceptions.FieldCheckExceptions;

public enum HoursOfOperation {

	BREAKFAST, BRUNCH, LUNCH, DINNER, OPENTOCLOSE;

	@Embedded
	private ElementTime elementTime;

	public void setStartAndEndTime(ElementTime elementTime) {
		this.elementTime = elementTime;
	}

	public ElementTime getElementTime() {

		return elementTime;
	}

}
