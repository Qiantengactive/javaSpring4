package com.spring.demo2;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDAOImplִ����...");
	}

	public void setup() {
		System.out.println("CustomerDAOImpl����ʼ����...");
	}

	public void destroy() {
		System.out.println("CustomerDAOImpl��������...");
	}
}
