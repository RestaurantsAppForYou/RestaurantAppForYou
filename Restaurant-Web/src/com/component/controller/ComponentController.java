package com.component.controller;

import java.util.List;

import com.component.info.ComponentInfo;

public interface ComponentController {

	public List<ComponentInfo> getAllComponents(String s);
	
	public ComponentInfo getComponent(String s);
	
	public String addComponent(String s);
	
	public String removeComponent(String s);
	
}
