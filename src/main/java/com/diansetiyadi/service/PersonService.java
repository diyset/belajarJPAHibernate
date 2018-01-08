package com.diansetiyadi.service;

import java.util.List;

import com.diansetiyadi.entity.Person;

public interface PersonService {

	public void add(Person person);
	public List<Person> listPersons();
}
