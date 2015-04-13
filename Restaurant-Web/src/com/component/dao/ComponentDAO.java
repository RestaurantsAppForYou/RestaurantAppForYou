package com.component.dao;

import java.util.List;

import com.component.entity.ComponentEntity;
import com.component.info.ComponentInfo;

public interface ComponentDAO {

	public void addComponent(ComponentInfo restaurants);
	public void deleteComponent(ComponentInfo restaurants);
	public List<ComponentEntity> searchComponent(String Id);
	public List<ComponentEntity> getAllComponent();
	
}
	