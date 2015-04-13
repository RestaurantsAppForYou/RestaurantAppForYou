package com.component.info;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class ComponentInfo {

	protected long component_id;
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
