package com.org.controller;

import static org.junit.jupiter.api.Assertions.*;

import com.org.entiry.ReservationEntity;
import com.org.exception.ReservationAlreadyExist;
import com.org.service.IReservationService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

class ResControllerTest {

	@Autowired
	private IReservationService iReservationService;


	@Test
	void testPostReservations() throws ReservationAlreadyExist {
		assertTrue(true);
	}

}
