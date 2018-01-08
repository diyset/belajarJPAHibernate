package com.diansetiyadi.dao;

import java.util.List;

import com.diansetiyadi.entity.Person;

public interface PersonDAO {
	public void add(Person person);
	public List<Person> listPerson();
}
