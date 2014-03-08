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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="person")
public class Person {

	@Id
	@Column(name="id_person")
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id_person;
	
	@Column(name="name")
	private String name;
	
    @ManyToOne
    @JoinColumn(name="country_id")
	private Country country_id;

	public Long getId_person() {
		return id_person;
	}

	public void setId_person(Long id_person) {
		this.id_person = id_person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Country country_id) {
		this.country_id = country_id;
	}
    
    
}
