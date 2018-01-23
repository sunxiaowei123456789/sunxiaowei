package com.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.UserDao;

public class Test {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext app = 
				   new FileSystemXmlApplicationContext("src/applicationContext.xml");
		UserDao userdao=app.getBean("userDao",UserDao.class);
		System.out.println(userdao);
	}
	
	
}
