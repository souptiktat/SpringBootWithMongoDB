package com.infytel.SpringMongoDB.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "Customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {

	@Id
	private Long phoneNumber;
	private String name;
	private Integer age;
	private Character gender;
	private String address;
}
