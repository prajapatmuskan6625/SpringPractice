package com.rays.scope.prototype;

public class UserService {

	public UserService() {
		System.out.println("Singleton UserService Created");
	}

	public String getUser() {
		return "Fetching user from Singleton Service";
	}
}