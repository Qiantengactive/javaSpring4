package com.spring.demo1;

public class UserDAOImpl implements UserDAO {
	private String name;

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserDAOImplִ����..." + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
