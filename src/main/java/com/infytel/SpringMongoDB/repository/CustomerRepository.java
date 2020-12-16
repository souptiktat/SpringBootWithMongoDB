package com.infytel.SpringMongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.infytel.SpringMongoDB.domain.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {

}
