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
package com.jbouguima.liferay.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.jbouguima.liferay.model.Country;
import com.jbouguima.liferay.model.Person;
import com.jbouguima.liferay.service.PersonService;



/**
 * Handles requests for the view mode.
 */
@Controller
@RequestMapping("VIEW")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private PersonService _personService;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RenderMapping
	public String home(Locale locale,  Model model) {
		
		List<Person> persons = _personService.getAllPerson();
		
		Person p= (Person)persons.get(2);
		Country c = p.getCountry_id();
		model.addAttribute("persons", persons);
		return "home";
	}


	public PersonService get_personService() {
		return _personService;
	}


	public void set_personService(PersonService _personService) {
		this._personService = _personService;
	}
	
	
}
