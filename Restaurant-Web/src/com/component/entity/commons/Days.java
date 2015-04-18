package com.component.entity.commons;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="DAYS")
public enum Days {
	MON,TUE,WED,THU,FRI,SAT,SUN;
	@Id
	String name = toString();
}
