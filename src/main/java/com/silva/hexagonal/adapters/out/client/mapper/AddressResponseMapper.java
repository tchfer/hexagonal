package com.silva.hexagonal.adapters.out.client.mapper;

import org.mapstruct.Mapper;

import com.silva.hexagonal.adapters.out.client.response.AddressResponse;
import com.silva.hexagonal.application.core.domain.Address;

@Mapper(componentModel = "string")
public interface AddressResponseMapper {
	
	Address toAddress(AddressResponse addressResponse);

}
