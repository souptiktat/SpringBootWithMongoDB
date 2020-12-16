package com.infytel.SpringMongoDB.service;

import com.infytel.SpringMongoDB.dto.CustomerDTO;

public interface CustomerService {

	// Method to access data access layer method to insert Customer record
	public void insertCustomer(CustomerDTO Customer) ;
	// Method to access data access layer method to remove a record
	public void removeCustomer(long phoneNo);
}
