package com.rays.bean;

public class TestUserBean {

	public static void main(String[] args) {

		// UserBean bean = new UserBean();

		// bean.setLogin("abc");
		// bean.setPassword("123");

		UserBean bean = new UserBean("abc", "123");

		System.out.println(bean.getLogin());
		System.out.println(bean.getPassword());

	}

}
