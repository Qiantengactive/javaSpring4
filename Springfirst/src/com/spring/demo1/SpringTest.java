package com.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
//	@Test
//	/**
//	 * ��ͳ��ʽ
//	 */
//	public void demo1() {
//		UserDAOImpl userDAO = new UserDAOImpl();
//		userDAO.setName("������");
//		userDAO.save();
//	}
	@Test
	/**
	 *  Spring�ķ�ʽ�ĵ���
	 */
	public void demo2() {
		// ����Spring�Ĺ���
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
		userDAO.save();
	}
}
