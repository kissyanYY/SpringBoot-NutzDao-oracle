package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Person;
import com.example.demo.service.PersonServiceInterface;

@Controller  
@EnableAutoConfiguration  
public class SampleController {
	
	@Autowired
    private PersonServiceInterface service;
	
	@RequestMapping("/insert")  
    @ResponseBody  
    public String home() {  
        Person p = new Person();
        p.setAge(10);
        p.setName("GG");
        service.insertObj(p);
        return "Hello World!";  
    }  
	
	
	@RequestMapping("/getP")  
    @ResponseBody  
    public String getPerson() { 
		Person p = service.getPersonByPropertis("GG");
		int a =  p.getAge();
		return "GG age:"+a;
	}
  
    public static void main(String[] args) throws Exception {  
        SpringApplication.run(SampleController.class, args);  
    }  
    
    
}
