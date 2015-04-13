package com.component.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.component.entity.RestaurantsEntity;
import com.component.info.Address;
import com.component.info.ComponentInfo;
import com.component.info.Restaurants;
import com.component.service.ComponentService;
import com.component.utils.TranslatorUtil;

@Controller
@RequestMapping("Restaurants")
public class RestaurantController implements ComponentController {

	@Autowired
	ComponentService restaurantsService;

	@RequestMapping(value = "/List/{name}", method = RequestMethod.GET)
	public @ResponseBody List<ComponentInfo> getAllComponents(
			@PathVariable String name) {

		if (null != name)
			return getRestaurantsByName(name);
		else
			return getRestaurantsList();
	}

	private List<ComponentInfo> getRestaurantsList() {

		// ModelAndView modelAndView = new ModelAndView();
		List<ComponentInfo> restaurantsList = null;

		List<ComponentEntity> restaurantsEntityList = restaurantsService
				.getAllComponents();

		if (restaurantsEntityList != null) {
			restaurantsList = new ArrayList<ComponentInfo>();
			restaurantsList = TranslatorUtil
					.getRestaurantsTranslator(restaurantsEntityList);
		}

		/*
		 * Map<Object, Object> jsonMap = new HashMap<Object, Object>();
		 * 
		 * try { jsonMap.put(Restaurants.class.newInstance(), restaurantsList);
		 * } catch (InstantiationException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } catch (IllegalAccessException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } //
		 * System.out.println(restaurants,restaurantsEntityList);
		 * 
		 * JSONObject jSONObject = new org.json.JSONObject(jsonMap);
		 * 
		 * System.out.println("JSON: " + jSONObject);
		 */
		// modelAndView.addObject("restaurants", restaurantsList);
		// modelAndView.setViewName("RestaurantsList");

		// modelMap.put("JSON", jSONObject);

		// return restaurantsList;

		return restaurantsList;

	}

	// @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	private List<ComponentInfo> getRestaurantsByName(@PathVariable String name) {

		List<ComponentInfo> restaurantsList = null;

		List<ComponentEntity> restaurantsEntityList = restaurantsService
				.getComponentsById(name);

		if (restaurantsEntityList != null) {
			restaurantsList = new ArrayList<ComponentInfo>();
			restaurantsList = TranslatorUtil
					.getRestaurantsTranslator(restaurantsEntityList);
		}

		return restaurantsList;
	}

	@RequestMapping("/Add")
	public String addComponent() {
		return null;
	}

	@Override
	public ComponentInfo getComponent(String s) {
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
