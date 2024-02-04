package com.neosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.entity.Person;
import com.neosoft.model.PersonRequest;
import com.neosoft.repository.IPersonRepo;

@Service
public class PersonService implements IPersonService{

	@Autowired
	private IPersonRepo repo;
	
	@Override
	public String savePerson(PersonRequest person) {
		
		Person p=new Person();
		p.setName(person.getName());
		p.setEmail(person.getEmail());
		return repo.save(p).getId()+ "is saved success fully";
	}
}
