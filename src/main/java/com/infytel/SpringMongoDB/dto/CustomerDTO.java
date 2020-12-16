package com.infytel.SpringMongoDB.dto;

import com.infytel.SpringMongoDB.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDTO {

	private Long phoneNumber;
	private String name;
	private Integer age;
	private Character gender;
	private String address;
	
	public static Customer prepareCustomerEntity(CustomerDTO customerDTO) {
		Customer customerEntity = new Customer();
		customerEntity.setPhoneNumber(customerDTO.getPhoneNumber());
		customerEntity.setName(customerDTO.getName());
		customerEntity.setGender(customerDTO.getGender());
		customerEntity.setAge(customerDTO.getAge());
		customerEntity.setAddress(customerDTO.getAddress());
		return customerEntity;
	}
}
