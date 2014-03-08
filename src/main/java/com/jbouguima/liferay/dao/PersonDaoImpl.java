/*
 * This file is part of LearNet-portlet.
 *
 * LearNet-portlet is free software: you can redistribute it and/or
 * modify it under the terms of the Apache V2 License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * LearNet-portlet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the Apache License along with
 * LearNet-portlet. If not, see <  http://www.apache.org/licenses//>.
 */
package com.jbouguima.liferay.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbouguima.liferay.model.Person;


@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	public PersonDaoImpl(){
		logger.info(" ===== PersonDao Created =====");
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	@Transactional
	public void saveOrUpdatePerson(Person person) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().saveOrUpdate(person);
	}
	@Transactional
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		Person p = (Person)sessionFactory.openSession().get(Person.class, id);
		return p;
	}
	@Transactional
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createQuery("from Person").list();
	}
	@Transactional
	public void removePerson(Long id) {
		// TODO Auto-generated method stub
		Person p = getPersonById(id);
		if (p != null)
			sessionFactory.openSession().delete(p);

	}

}
