Liferay_6.2.0 Spring Hibernate Maven Bootstrap Portlet MVC
===========================================================
Liferay Spring Portlet MVC Bootstrap project template using Maven.

* Liferay CE 6.2.0
* Java 1.6
* Portlet 2.0
* Spring Framework 3.2.5
* Hibernte 4.2.0
* Bootstrap 3.1.1
* Annotation-based controller configuration

Usage
-----
```bash
$ git clone https://github.com/JBouguima/Liferay_6.2.0-SpringMVC-Hibernate-Bootstrap.git
$ cd liferay-spring-mvc-portlet
$ mvn package
```

Deploy
------
If you're using Liferay Portal with Tomcat, copy the war to the deploy directory.

```
$ cp target/liferay-spring-mvc-portlet.war $LIFERAY_HOME/deploy/
```

Configuration
-------------

Default settings are Liferay CE 6.2.0, Java 1.6, Portlet 2.0, Spring 3.2, Hibernate 4.2.0 and Bootstrap 3.1.1
All can be configured in [pom.xml](https://github.com/JBouguima/Liferay_6.2.0-SpringMVC-Hibernate-Bootstrap/pom.xml)

```xml
	<properties>
		<liferay.version>6.2.0-ce-ga1</liferay.version>
		<liferay.auto.deploy.dir>C:\liferay-portal-6.2.0-ce-ga1\deploy</liferay.auto.deploy.dir>
		<java-version>1.6</java-version>
		<portlet-api.version>2.0</portlet-api.version>
		<servlet-api.version>2.5</servlet-api.version>
		<jsp-api.version>2.2</jsp-api.version>
		<jstl.version>1.2</jstl.version>
		<org.springframework-version>3.2.5.RELEASE</org.springframework-version>
		<hibernate.version>4.2.0.Final</hibernate.version>
		<org.aspectj-version>1.7.4</org.aspectj-version>
		<org.slf4j-version>1.7.5</org.slf4j-version>
	</properties>
```

Archetype
---------

The main point of this project is to create a Maven archetype.

Add an entry for the archetype in: ```~/.m2/archetype-catalog.xml```

```xml
<archetype>
  <groupId>com.jbouguima</groupId>
  <artifactId>LearNet</artifactId>
  <version>1.1-RELEASE</version>
  <repository>https://raw.github.com/JBouguima/maven-repo/master/releases</repository>
  <description>liferay-spring-mvc-hibernate-maven-portlet-archetype</description>
</archetype>
```

Run the maven archetype generate command.  Follow the prompts to specify the groupId, artifactId, and version for your project.

```bash
$ mvn archetype:generate -DarchetypeCatalog=local
```
Database
----------
`CREATE TABLE person (
  id_person int(11) NOT NULL,
  name varchar(255) DEFAULT NULL,
  country_id int(11) NOT NULL NULL,
  PRIMARY KEY (id_person),
  KEY FK_Country (country_id),
  CONSTRAINT FK_Country FOREIGN KEY (country_id) REFERENCES country (country_id)
)

CREATE TABLE country (
  country_id int(11) NOT NULL AUTO_INCREMENT,
  name_country varchar(255) DEFAULT NULL,
   PRIMARY KEY (country_id)
)`

Licence
-------

Copyright 2013 Jileni BOUGUIMA

