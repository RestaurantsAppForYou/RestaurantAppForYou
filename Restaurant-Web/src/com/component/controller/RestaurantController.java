package com.component.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.component.entity.ComponentEntity;
import com.component.entity.HoursOfOperationEntity;
import com.component.entity.RestaurantsEntity;
import com.component.info.Address;
import com.component.info.ComponentInfo;
import com.component.info.ComponentResponse;
import com.component.info.HoursOfOperationInfo;
import com.component.info.Restaurants;
import com.component.service.ComponentService;
import com.component.utils.TranslatorUtil;

@Controller
@RequestMapping("Restaurants")
public class RestaurantController implements ComponentController {

	@Autowired
	ComponentService restaurantsService;
	ComponentResponse componentResponse;

	public RestaurantController() {
		componentResponse = (null == componentResponse) ? (new ComponentResponse())
				: componentResponse;
	}

	@RequestMapping(value = "/List/{name}", method = RequestMethod.GET)
	public @ResponseBody ComponentResponse getAllComponents(
			@PathVariable String name) {

		System.out.println("name : " + name);
		if (null != name && !("1".equalsIgnoreCase(name)))
			return getRestaurantsByName(name);
		else
			return getRestaurantsList();
	}

	// @RequestMapping(value = "/List", method = RequestMethod.GET)
	public ComponentResponse getRestaurantsList() {

//		ModelAndView modelAndView = new ModelAndView();

		List<ComponentEntity> restaurantsEntityList = restaurantsService
				.getAllComponents();

		if (null != restaurantsEntityList) {
			componentResponse.setConponentInfoList(TranslatorUtil
					.getRestaurantsTranslator(restaurantsEntityList));
		}

		return componentResponse;
	}

	/*
	 * Map<Object, Object> jsonMap = new HashMap<Object, Object>();
	 * 
	 * try { jsonMap.put(Restaurants.class.newInstance(), restaurantsList); }
	 * catch (InstantiationException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IllegalAccessException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } //
	 * System.out.println(restaurants,restaurantsEntityList);
	 * 
	 * JSONObject jSONObject = new org.json.JSONObject(jsonMap);
	 * 
	 * System.out.println("JSON: " + jSONObject);
	 */

	// modelMap.put("JSON", jSONObject);

	// return restaurantsList;

	// @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	private ComponentResponse getRestaurantsByName(@PathVariable String name) {

		ComponentResponse componentResponse = new ComponentResponse();

		List<ComponentEntity> restaurantsEntityList = restaurantsService
				.getComponentsById(name);

		if (null != restaurantsEntityList) {
			componentResponse.setConponentInfoList(TranslatorUtil
					.getRestaurantsTranslator(restaurantsEntityList));
		}

		return componentResponse;
	}

	@RequestMapping("/Add")
	public String addComponent() {
		return null;
	}

	@Override
	public ComponentResponse getComponent(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeComponent(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addComponent(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
