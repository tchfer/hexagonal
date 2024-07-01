package com.silva.hexagonal.adapters.in.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.silva.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.silva.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
@Component
public interface CustomerMapper {
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "address", ignore = true)
	@Mapping(target = "isValidCpf", ignore = true)
	Customer toCustomer(CustomerRequest customerRequest);

}
