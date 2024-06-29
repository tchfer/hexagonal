package com.silva.hexagonal.adapters.out.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "customers")
public class CustomerEntity {
	
	@Id
	private String id;
	private String nome;
	private AddressEntity addressEntity;
	private String cpf;
	private Boolean isValidCpf;
	
}
