package com.neosoft.repository;

import org.springframework.data.repository.CrudRepository;

import com.neosoft.entity.Person;

public interface IPersonRepo extends CrudRepository<Person, Integer>{

}
