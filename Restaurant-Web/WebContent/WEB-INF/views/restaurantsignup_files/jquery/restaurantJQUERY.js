$(document).ready(
		function() {

			var longitude;
			var longitude;
			var hoursOfOperation = [];

			$(".addHours").click(
					function() {

						var appendNum = 0;
						var endTimeValue = $(".hours-end").val();
						var startTimeValue = $(".hours-start").val();
						var weekdayValue = $(".weekday").val();

						var wekkTimeMap = {};
						wekkTimeMap[weekdayValue] = [ startTimeValue,
								endTimeValue ];

						hoursOfOperation.push(wekkTimeMap);

						var html = "<div><span>" + weekdayValue
								+ ": </span><span>" + startTimeValue
								+ "</span> <span> to &nbsp;" + endTimeValue +"</span></div>";
						
						var remove = "<p>remove</p>";
						
						$(html).insertBefore(".hours-display");
//						$(remove).insertBefore(".remove");

					});

			// hiding and showing the time sheets
			$("#fullTimeSheet").hide();
			$(".fullWeekTime").click(function() {
				$("#fullTimeSheet").fadeIn(2000)
				$("#partTimeSheet").fadeOut(20)
			});

			$(".partWeekTime").click(function() {
				$("#partTimeSheet").fadeIn(2000)
				$("#fullTimeSheet").fadeOut(20)
			});

			// validating the the timings

			$(".submit").click(
					function() {
						// validate();

						var addr1 = $('.element-address').find('.addr1').find(
								"input:text").text();
						var addr2 = $('.element-address').find('.addr2').find(
								"input:text").text();
						var city = $('.element-address').find('.city').find(
								"input:text").text();
						var state = $('.element-address').find('.state').find(
								"input:text").text();
						var zip = $('.element-address').find('.zip').find(
								"input:text").val();

						// alert(zip);
						var geocoder = new google.maps.Geocoder();
						var address = addr1 + city + state + zip;

						geocoder.geocode({
							'address' : address
						}, function(results, status) {

							// if (status == google.maps.GeocoderStatus.OK) {
							latitude = results[0].geometry.location.lat();
							longitude = results[0].geometry.location.lng();

							// }
						});

						alert(JSON.stringify(hoursOfOperation)
								+ "  Location :  " + latitude);
						// alert(latitude);

					});
			
			
			
			// This example displays an address form, using the autocomplete feature
			// of the Google Places API to help users fill in the information.

			var placeSearch, autocomplete;
			var componentForm = {
			  street_number: 'short_name',
			  route: 'long_name',
			  locality: 'long_name',
			  administrative_area_level_1: 'short_name',
			  country: 'long_name',
			  postal_code: 'short_name'
			};

			function initialize() {
			  // Create the autocomplete object, restricting the search
			  // to geographical location types.
			  autocomplete = new google.maps.places.Autocomplete(
			      /** @type {HTMLInputElement} */(document.getElementById('autocomplete')),
			      { types: ['geocode'] });
			  // When the user selects an address from the dropdown,
			  // populate the address fields in the form.
			  google.maps.event.addListener(autocomplete, 'place_changed', function() {
			    fillInAddress();
			  });
			}

			// [START region_fillform]
			function fillInAddress() {
			  // Get the place details from the autocomplete object.
			  var place = autocomplete.getPlace();

			  for (var component in componentForm) {
			    document.getElementById(component).value = '';
			    document.getElementById(component).disabled = false;
			  }

			  // Get each component of the address from the place details
			  // and fill the corresponding field on the form.
			  for (var i = 0; i < place.address_components.length; i++) {
			    var addressType = place.address_components[i].types[0];
			    if (componentForm[addressType]) {
			      var val = place.address_components[i][componentForm[addressType]];
			      document.getElementById(addressType).value = val;
			    }
			  }
			}
			// [END region_fillform]

			// [START region_geolocation]
			// Bias the autocomplete object to the user's geographical location,
			// as supplied by the browser's 'navigator.geolocation' object.
			function geolocate() {
			  if (navigator.geolocation) {
			    navigator.geolocation.getCurrentPosition(function(position) {
			      var geolocation = new google.maps.LatLng(
			          position.coords.latitude, position.coords.longitude);
			      var circle = new google.maps.Circle({
			        center: geolocation,
			        radius: position.coords.accuracy
			      });
			      autocomplete.setBounds(circle.getBounds());
			    });
			  }
			}
			
			

		});

/*function validate() {

	var endTime = Number($("#endTime").val());
	var startTime = Number($("#startTime").val());

	if (endTime < StartTime) {
		$("#endTime").after('<span class="error"> Please enter Right </span>');
	}

}*/
// This example displays an address form, using the
// autocomplete feature
// of the Google Places API to help users fill in the
// information.

var placeSearch, autocomplete;
var componentForm = {
	street_number : 'short_name',
	route : 'long_name',
	locality : 'long_name',
	administrative_area_level_1 : 'short_name',
	country : 'long_name',
	postal_code : 'short_name'
};

function initialize() {
	// Create the autocomplete object, restricting the
	// search
	// to geographical location types.
	autocomplete = new google.maps.places.Autocomplete(
	/** @type {HTMLInputElement} */
	(document.getElementById('autocomplete')), {
		types : [ 'geocode' ]
	});
	// When the user selects an address from the dropdown,
	// populate the address fields in the form.
	google.maps.event.addListener(autocomplete,
			'place_changed', function() {
				fillInAddress();
			});
}

// [START region_fillform]
function fillInAddress() {
	// Get the place details from the autocomplete object.
	var place = autocomplete.getPlace();

	for ( var component in componentForm) {
		document.getElementById(component).value = '';
		document.getElementById(component).disabled = false;
	}

	// Get each component of the address from the place
	// details
	// and fill the corresponding field on the form.
	for (var i = 0; i < place.address_components.length; i++) {
		var addressType = place.address_components[i].types[0];
		if (componentForm[addressType]) {
			var val = place.address_components[i][componentForm[addressType]];
			document.getElementById(addressType).value = val;
		}
	}
}
// [END region_fillform]

// [START region_geolocation]
// Bias the autocomplete object to the user's geographical
// location,
// as supplied by the browser's 'navigator.geolocation'
// object.
function geolocate() {
	if (navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(function(
				position) {
			var geolocation = new google.maps.LatLng(
					position.coords.latitude,
					position.coords.longitude);
			var circle = new google.maps.Circle({
				center : geolocation,
				radius : position.coords.accuracy
			});
			autocomplete.setBounds(circle.getBounds());
		});
	}
}




