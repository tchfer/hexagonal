package com.silva.hexagonal.application.ports.out;

import com.silva.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
	
	public void insert(Customer customer);
}
