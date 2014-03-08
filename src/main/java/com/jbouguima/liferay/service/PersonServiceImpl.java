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
package com.jbouguima.liferay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jbouguima.liferay.dao.PersonDao;
import com.jbouguima.liferay.model.Person;

@Transactional
@Service("PersonService")
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao personDao;
	
	public PersonServiceImpl(){
		logger.info(" ===== PersonService Created =====");
	}
	
	@Transactional
	public void saveOrUpdatePerson(Person person) {
		// TODO Auto-generated method stub
		personDao.saveOrUpdatePerson(person);
	}

	@Transactional
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return personDao.getPersonById(id);
	}

	@Transactional
	public List<Person> getAllPerson() {
		// TODO Auto-generated method stub
		return personDao.getAllPerson();
	}

	@Transactional
	public void removePerson(Long id) {
		// TODO Auto-generated method stub
		personDao.removePerson(id);
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	
}
