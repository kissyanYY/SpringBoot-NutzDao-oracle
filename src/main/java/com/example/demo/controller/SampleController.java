package com.example.demo.controller;

import java.util.List;

import org.nutz.dao.Dao;
import org.nutz.dao.util.DaoUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.bean.Person;

@Controller  
@EnableAutoConfiguration  
public class SampleController {
//	@Autowired
//    private JdbcTemplate jdbcTemplate;
	@Autowired
    private Dao dao;
	
	@RequestMapping("/insert")  
    @ResponseBody  
    public String home() {  
//		String sql = "insert into yyuser (id,name) values (2,'lisi')";
//        jdbcTemplate.execute(sql);
        System.out.println("执行完成 3");
//		dao.create(Person.class, true);
        Person p = new Person();
        p.setAge(10);
        p.setName("GG");
        dao.insert(p);
        
		DaoUp.me().close();
        return "Hello World!";  
    }  
	
	
	@RequestMapping("/getP")  
    @ResponseBody  
    public String getPerson() { 
		Person p = dao.fetch(Person.class,"GG");
		int a =  p.getAge();
		return "GG age:"+a;
	}
  
    public static void main(String[] args) throws Exception {  
        SpringApplication.run(SampleController.class, args);  
    }  
    
    
}
