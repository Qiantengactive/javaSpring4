package com.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
//	@Test
//	/**
//	 *  �������ڵ�����
//	 */
//	public void demo1() {
//		// ����Spring�Ĺ���
//		ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
//		CustomerDAO customerDAO = (CustomerDAO) applicationContext.getBean("customerDAO");
//		customerDAO.save();
//		applicationContext.close();
//	}
	
	@Test
	/**
	 * Bean�����÷�Χ����
	 */
	public void demo2() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerDAO customerDAO1 = (CustomerDAO) applicationContext.getBean("customerDAO2");
		System.out.println(customerDAO1);
		CustomerDAO customerDAO2 = (CustomerDAO) applicationContext.getBean("customerDAO2");
		System.out.println(customerDAO2);
		System.out.println(customerDAO1==customerDAO2);
		applicationContext.close();
	}
}
