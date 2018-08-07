package com.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
//	@Test
//	/**
//	 * 传统方式
//	 */
//	public void demo1() {
//		UserDAOImpl userDAO = new UserDAOImpl();
//		userDAO.setName("王麻子");
//		userDAO.save();
//	}
	@Test
	/**
	 *  Spring的方式的调用
	 */
	public void demo2() {
		// 创建Spring的工厂
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
		userDAO.save();
	}
}
