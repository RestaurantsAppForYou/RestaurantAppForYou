package com.component.info;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.component.entity.HoursOfOperationEntity;

public class ComponentResponse {

	private List<ComponentInfo> conponentInfoList;

	public List<ComponentInfo> getConponentInfoList() {
		return conponentInfoList;
	}

	public void setConponentInfoList(List<ComponentInfo> conponentInfoList) {
		this.conponentInfoList = conponentInfoList;
	}

	@Override
	public String toString() {
		return "ComponentResponse [conponentInfoList=" + conponentInfoList
				+ "]";
	}

}
