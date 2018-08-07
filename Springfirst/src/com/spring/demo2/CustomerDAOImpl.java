package com.spring.demo2;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDAOImpl执行了...");
	}

	public void setup() {
		System.out.println("CustomerDAOImpl被初始化了...");
	}

	public void destroy() {
		System.out.println("CustomerDAOImpl被销毁了...");
	}
}
