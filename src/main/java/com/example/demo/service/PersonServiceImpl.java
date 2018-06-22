package com.example.demo.service;

import java.util.List;

import org.nutz.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Person;
@Repository
public class PersonServiceImpl implements PersonServiceInterface {
	@Autowired
    private Dao dao;
	
	@Override
	public Person getPersonByPropertis(String pro) {
		// TODO Auto-generated method stub
		Person p = dao.fetch(Person.class,pro);
		return  p;
	}


	@Override
	public void insertObj(Object p) {
		// TODO Auto-generated method stub
		dao.insert(p);
	}


	@Override
	public void createTable(Class<?> table) {
		// TODO Auto-generated method stub
		dao.create(table,false);
	}

}
