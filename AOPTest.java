package com.hfxt.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hfxt.service.UserService;
import com.hfxt.service.UserServiceImpl;

public class AOPTest{
	
	@Test
	public void test0(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAop.xml");
		UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
		userService.queryAllUser();
	}
	
	@Test
	public void test5(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContextAop.xml");
		UserService userService = context.getBean("userService", UserService.class);
		userService.queryAllUser();
	}
	
		
		
		
		
}
