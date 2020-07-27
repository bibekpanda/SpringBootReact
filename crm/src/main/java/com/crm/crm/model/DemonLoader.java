package com.crm.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemonLoader implements CommandLineRunner {

	private final ContactRepository contactRepository;
	
	
	@Autowired
	public DemonLoader(ContactRepository contactRepository) {
		this.contactRepository = contactRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.contactRepository.save(new Contact("Bibek", "Panda", "Rahul@gmail.com"));
	}

}
