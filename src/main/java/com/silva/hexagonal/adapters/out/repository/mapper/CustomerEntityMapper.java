package com.silva.hexagonal.adapters.out.repository.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.silva.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.silva.hexagonal.application.core.domain.Customer;

@Mapper(componentModel = "spring")
@Component
public interface CustomerEntityMapper {
	
	CustomerEntity toCustomerEntity(Customer customer);
}
