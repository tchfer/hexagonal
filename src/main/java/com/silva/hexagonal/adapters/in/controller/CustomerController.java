package com.silva.hexagonal.adapters.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silva.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.silva.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.silva.hexagonal.application.ports.in.InsertCustomerInputPort;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

	@Autowired
	private InsertCustomerInputPort insertCustomerInputPort;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	
	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
		var customer = customerMapper.toCustomer(customerRequest);
		insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
		return ResponseEntity.ok().build();
	}
}