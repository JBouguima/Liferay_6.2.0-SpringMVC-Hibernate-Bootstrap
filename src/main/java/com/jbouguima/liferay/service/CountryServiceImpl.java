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

import com.jbouguima.liferay.dao.CountryDao;
import com.jbouguima.liferay.model.Country;

@Transactional
@Service("CountryService")
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryDao countryDao;
	
	public CountryServiceImpl(){
		logger.info(" ===== CountryService Created =====");
	}
	
	@Override
	public void saveOrUpdateCountry(Country country) {
		// TODO Auto-generated method stub
		countryDao.saveOrUpdateCountry(country);
	}

	@Override
	public Country getCountryByName(String country_name) {
		// TODO Auto-generated method stub
		return countryDao.getCountryByName(country_name);
	}

	@Override
	public Country getCountryById(Long country_id) {
		// TODO Auto-generated method stub
		return countryDao.getCountryById(country_id);
	}

	@Override
	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		return countryDao.getAllCountry();
	}

	@Override
	public void removeCountry(Long id) {
		// TODO Auto-generated method stub
		countryDao.removeCountry(id);
	}

	public CountryDao getCountryDao() {
		return countryDao;
	}

	public void setCountryDao(CountryDao countryDao) {
		this.countryDao = countryDao;
	}

	
}
