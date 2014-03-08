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
package com.jbouguima.liferay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
    @Id
    @GeneratedValue
    @Column(name="country_id")
    private Long country_id;
     
    @Column(name="name_country")
    private String name_country;

	public Long getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Long country_id) {
		this.country_id = country_id;
	}

	public String getName_country() {
		return name_country;
	}

	public void setName_country(String name_country) {
		this.name_country = name_country;
	}

	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", name_country="
				+ name_country + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((country_id == null) ? 0 : country_id.hashCode());
		result = prime * result
				+ ((name_country == null) ? 0 : name_country.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (country_id == null) {
			if (other.country_id != null)
				return false;
		} else if (!country_id.equals(other.country_id))
			return false;
		if (name_country == null) {
			if (other.name_country != null)
				return false;
		} else if (!name_country.equals(other.name_country))
			return false;
		return true;
	}
    
    
    

}
