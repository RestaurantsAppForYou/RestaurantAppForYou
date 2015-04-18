package com.java.restaurant.tablegenerator;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

public class GooglAPIDEMO {

	
	public static void main(String[] args) throws Exception {
		
		GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyBaSZDTD8XcuGTAW2RhAEieXl5UNz__Ank");
		GeocodingResult[] results =  GeocodingApi.geocode(context,
		    "1600 Amphitheatre Parkway Mountain View, CA 94043").await();
		System.out.println(results[0].formattedAddress);
	}
}
