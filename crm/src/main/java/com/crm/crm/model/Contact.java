package com.crm.crm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contact {
	@Id
	@GeneratedValue
	public long id;
	public String firstName;
	public String lastName;
	public String  email;
	
	public Contact() {
		
	}
	public Contact(String firstName, String lastName, String email) {
		firstName = this.firstName;
		lastName = this.lastName;
		this.email = email;
	}
	
	
	
}
