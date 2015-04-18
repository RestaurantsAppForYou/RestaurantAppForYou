package com.component.commons;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public enum DayType {
	BREAKFAST,LUNCH,DINNER,GENERIC;
	
	/*@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long dataTypeId;*/
}
