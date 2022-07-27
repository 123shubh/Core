
package com.org.conrtoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dto.RatesDTO;
import com.org.entiry.Rates;
import com.org.service.IRatesServices;

import io.swagger.annotations.Api;

@CrossOrigin("*")

@RestController

@RequestMapping("/rates-controller")

@Api(value = "Opeartions realted to rates perform via this controller")
public class RatesController {

	@Autowired
	private IRatesServices iRatesServices;

	@PostMapping("/add-rate")
	public ResponseEntity<String> addRates(@RequestBody RatesDTO rates) {
		iRatesServices.addRates(rates);
		return ResponseEntity.status(HttpStatus.OK).body("Rate added successfully");
	}

	@GetMapping("/get-all-rates")
	public ResponseEntity<List<Rates>> getAllRates() {
		List<Rates> rates = iRatesServices.getAllRates();
		return ResponseEntity.status(HttpStatus.OK).body(rates);
	}
	
	@GetMapping("/get-rate-by-id/{rateId}")
	public ResponseEntity<Optional<Rates>> getRatesById(@PathVariable int rateId){
		Optional<Rates> rate=iRatesServices.getRatesById(rateId);
		return ResponseEntity.status(HttpStatus.OK).body(rate);
	}

}
