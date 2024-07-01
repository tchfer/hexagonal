package com.silva.hexagonal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.silva.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.silva.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.silva.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
//import com.silva.hexagonal.application.ports.in.InsertCustomerInputPort;
//
//@SpringBootTest
//class HexagonalApplicationTests {
//
//	@Autowired
//	private InsertCustomerInputPort insertCustomerInputPort;
//	
//	@Autowired
//    private CustomerMapper customerMapper;
//	
//	@Autowired
//	private AddressResponseMapper addressResponseMapper;
//	
//	@Autowired
//	private CustomerEntityMapper customerEntityMapper;
//
//	@Test
//	void contextLoads() {
//		assertNotNull(customerMapper);
//        assertNotNull(addressResponseMapper);
//        assertNotNull(customerEntityMapper);
//        assertNotNull(insertCustomerInputPort);
//	}
//
//}
