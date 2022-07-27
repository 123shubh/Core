
package com.org.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dto.RatesDTO;
import com.org.entiry.Rates;
import com.org.entiry.Rooms;
import com.org.repository.RatesRepository;

@Service
public class RatesServices implements IRatesServices {

	@Autowired
	private RatesRepository ratesRepository;

	@Autowired
	private IRoomsServices roomsServices;

	public static final Logger logger = LoggerFactory.getLogger(RatesServices.class);

	@Override
	public boolean addRates(RatesDTO rates) {
		try {
			Optional<Rooms> room = roomsServices.getRoomById(rates.getReferencedRoomId());
			if (room.isPresent()) {
				Rooms newRoom = room.get();
				// logger.info("newRoom line 32 ratesservices :{}", newRoom);
				Rates newRates = new Rates(rates.getRateId(), rates.getRateName(), rates.getRateDetails(), newRoom,
						rates.getRatePerNight());
				ratesRepository.save(newRates);
				return true;
			}
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		return false;
	}

	@Override
	public List<Rates> getAllRates() {
		return (List<Rates>) ratesRepository.findAll();
	}

	@Override
	public Optional<Rates> getRatesById(int rateId) {
		return ratesRepository.findById(rateId);
	}

}
