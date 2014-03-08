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

import com.jbouguima.liferay.model.Country;

public interface CountryService {

	void saveOrUpdateCountry(Country country);	
	Country getCountryByName(String country_name);
	Country getCountryById(Long country_id);
	List<Country> getAllCountry();	
	void removeCountry(Long id);
}
