package com.component.service;

import java.util.List;

import com.component.entity.ComponentEntity;

public interface ComponentService {


	public List<ComponentEntity> getAllComponents();
	
	public List<ComponentEntity> getComponentsById(String Id);
	
}
