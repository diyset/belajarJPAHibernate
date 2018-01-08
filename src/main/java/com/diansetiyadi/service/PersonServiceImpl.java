package com.diansetiyadi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diansetiyadi.dao.PersonDAO;

@Service
public class PersonServiceImpl {
	
	@Autowired
	private PersonDAO personDAO;
}
