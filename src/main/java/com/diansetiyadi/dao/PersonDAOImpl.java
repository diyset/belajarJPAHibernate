package com.diansetiyadi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.diansetiyadi.entity.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public void add(Person person) {
		em.persist(person);

	}

	@Override
	public List<Person> listPerson() {
		CriteriaQuery<Person> criteriaQuery = em.getCriteriaBuilder().createQuery(Person.class);
		
		Root<Person> root = criteriaQuery.from(Person.class);
		// TODO Auto-generated method stub
		return em.createQuery(criteriaQuery).getResultList();
	}

}
