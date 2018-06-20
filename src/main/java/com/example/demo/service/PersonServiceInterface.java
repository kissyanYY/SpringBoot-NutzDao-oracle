package com.example.demo.service;

import java.util.List;

import com.example.demo.bean.Person;

public interface PersonServiceInterface {

	public List getPersons();
	
	public void insertObj(Person p);
	
	public Person getPersonByPropertis(String pro);
}
