package com.silva.hexagonal.application.core.usecase;

import com.silva.hexagonal.application.core.domain.Customer;
import com.silva.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.silva.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.silva.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {
	
	private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
	
	private final InsertCustomerOutputPort insertCustomerOutputPort;
	
	public InsertCustomerUseCase(
			FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
			InsertCustomerOutputPort insertCustomerOutputPort
	) {
		this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
		this.insertCustomerOutputPort = insertCustomerOutputPort;
	}

	@Override
	public void insert(Customer customer, String zipCode) {
		var address = findAddressByZipCodeOutputPort.find(zipCode);
		customer.setAddress(address);
		insertCustomerOutputPort.insert(customer);
	}

}
