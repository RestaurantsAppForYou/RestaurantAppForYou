package com.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.restaurant.service.RestaurantsServiceInterface;
import com.restaurants.info.Restaurants;

@Controller
@RequestMapping("Restaurants")
public class RestaurantController {

	@Autowired
	RestaurantsServiceInterface restaurantsService;

	@RequestMapping("/List")
	public ModelAndView getRestaurants() {
		// TODO Auto-generated method stub

		ModelAndView modelAndView = new ModelAndView("RestaurantsList");

		return modelAndView;
	}

	@RequestMapping("/ListById")
	public Restaurants getRestaurantsByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/Add")
	public void addRestaurants() {
		// TODO Auto-generated method stub

		// ModelAndView modelAndView = new ModelAndView(viewName)

	}

	@RequestMapping("/Remove")
	public void removeRestaurants() {
		// TODO Auto-generated method stub
	}

}
