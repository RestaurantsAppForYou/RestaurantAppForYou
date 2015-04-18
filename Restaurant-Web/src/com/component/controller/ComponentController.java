	package com.component.controller;

import java.util.List;

import com.component.info.ComponentInfo;
import com.component.info.ComponentResponse;

public interface ComponentController {

	public ComponentResponse getAllComponents(String s);
	
	public ComponentResponse getComponent(String s);
	
	public String addComponent(String s);
	
	public String removeComponent(String s);
	
}
