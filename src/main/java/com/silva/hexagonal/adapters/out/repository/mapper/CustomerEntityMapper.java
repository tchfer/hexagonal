package com.silva.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;

import com.silva.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.silva.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "string")
public interface CustomerEntityMapper {
	
	CustomerEntity toCustomerEntity(Customer customer);
}
