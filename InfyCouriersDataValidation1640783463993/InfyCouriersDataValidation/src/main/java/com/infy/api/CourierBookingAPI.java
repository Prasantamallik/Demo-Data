package com.infy.api;


import org.springframework.core.env.Environment;

import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.RequestBody;


import com.infy.dto.BookingDTO;
import com.infy.exception.InfyCourierException;
import com.infy.service.BookingService;

public class CourierBookingAPI {

	private BookingService bookingService;

	private Environment environment;

	public ResponseEntity<String> bookCourier(@RequestBody BookingDTO bookingDTO) throws InfyCourierException {
		return null;

	}

	public ResponseEntity<BookingDTO> getCourierDetails(Integer bookingId) throws InfyCourierException {
		return null;
	}

}
