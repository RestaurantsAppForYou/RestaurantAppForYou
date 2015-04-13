package com.component.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;


@Entity(name="COMPONENT")
public abstract class ComponentEntity {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="COMPONENT_ID")
	protected long component_id;
	@Column(name="COMPONENT_NAME")
	protected String name;

	public long getiD() {
		return component_id;
	}

	public void setiD(long component_id) {
		this.component_id = component_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
