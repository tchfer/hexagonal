package com.silva.hexagonal.adapters.in.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.silva.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.silva.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "string")
public interface CustomerMapper {
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "address", ignore = true)
	@Mapping(target = "isValidCpf", ignore = true)
	Customer toCustomer(CustomerRequest customerRequest);

}
