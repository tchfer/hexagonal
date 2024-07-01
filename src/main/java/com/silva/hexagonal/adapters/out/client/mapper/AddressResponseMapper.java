package com.silva.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.silva.hexagonal.adapters.out.client.response.AddressResponse;
import com.silva.hexagonal.application.core.domain.Address;

@Mapper (componentModel = "spring")
@Component
public interface AddressResponseMapper {
	
	Address toAddress(AddressResponse addressResponse);

}
