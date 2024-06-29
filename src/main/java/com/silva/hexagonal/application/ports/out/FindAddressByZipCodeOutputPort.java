package com.silva.hexagonal.application.ports.out;

import com.silva.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
	
	Address find(String zipCode);
}
