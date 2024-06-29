package com.silva.hexagonal.application.ports.in;

import com.silva.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

	void insert(Customer customer, String zipCode);
	
	
}
