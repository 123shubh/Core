
package com.org.service;

import java.util.List;
import java.util.Optional;

import com.org.dto.RatesDTO;
import com.org.entiry.Rates;

public interface IRatesServices {

	public boolean addRates(RatesDTO rates);

	public List<Rates> getAllRates();
	
	public Optional<Rates> getRatesById(int rateId);
	
}
