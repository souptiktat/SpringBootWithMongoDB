package com.infytel.SpringMongoDB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infytel.SpringMongoDB.dto.CustomerDTO;
import com.infytel.SpringMongoDB.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository  repository;
	
	@Override
	public void insertCustomer(CustomerDTO Customer) {
		repository.save(CustomerDTO.prepareCustomerEntity(Customer));
		
	}
	@Override
	public void removeCustomer(long phoneNo) {
		// TODO Auto-generated method stub
		repository.deleteById(phoneNo);
	} 
}
