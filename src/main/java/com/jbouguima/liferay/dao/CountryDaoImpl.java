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

import com.jbouguima.liferay.model.Country;


@Repository
@Transactional
public class CountryDaoImpl implements CountryDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CountryDaoImpl(){
		logger.info(" ===== CountryDao Created =====");
	}
	
	@Transactional
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Transactional
	public void saveOrUpdateCountry(Country country) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().saveOrUpdate(country);
	}
	@Transactional
	public Country getCountryByName(String country_name) {
		// TODO Auto-generated method stub
		Country c = (Country)sessionFactory.openSession().get(Country.class, country_name);
		return c;
	}
	@Transactional
	public Country getCountryById(Long country_id) {
		// TODO Auto-generated method stub
		Country c = (Country)sessionFactory.openSession().get(Country.class, country_id);
		return c;
	}
	@Transactional
	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession().createQuery("from Country").list();
	}
	@Transactional
	public void removeCountry(Long id) {
		// TODO Auto-generated method stub
		Country c = getCountryById(id);
		if (c != null)
			sessionFactory.openSession().delete(c);
	}

}
