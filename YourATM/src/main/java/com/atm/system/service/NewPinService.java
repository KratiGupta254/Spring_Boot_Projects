package com.atm.system.service;



import com.atm.system.dto.NewPinDto;

public interface NewPinService {

	//ResponseEntity<Object> changePin(NewPinDto newPinDto);

	boolean changePin(NewPinDto newPinDto);

}
