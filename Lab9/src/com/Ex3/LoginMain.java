package com.Ex3;

public class LoginMain {
	
	public static void main(String[] args) {

		String name = "admin";
		String pass = "admin";
		Login res = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(res.checkIdentity("admin", "admin"));
	}

}
