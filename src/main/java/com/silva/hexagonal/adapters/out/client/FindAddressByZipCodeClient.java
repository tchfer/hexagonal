package com.silva.hexagonal.adapters.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.silva.hexagonal.adapters.out.client.response.AddressResponse;

@FeignClient(
		name = "FindAddressByZipCodeClient",
		url = "${silva.client.address.url}"
)
public interface FindAddressByZipCodeClient {
	
	@GetMapping("/{zipCode}")
	AddressResponse find(@PathVariable("zipCode") String zipString);

}
