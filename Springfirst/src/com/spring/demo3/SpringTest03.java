package com.spring.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean��ʵ�����ķ�ʽ
 *
 */
public class SpringTest03 {
//	@Test
//	/**
//	 * �޲εĹ��췽��
//	 */
//	public void demo1() {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
//	}
//	
	@Test
	/**
	 * ��̬����ʵ����
	 */
	public void demo2() {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
//		System.out.println(bean2);
	}
}
