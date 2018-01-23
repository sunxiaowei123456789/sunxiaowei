package com.bean;

public class UserDao {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDao(User user) {
		super();
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDao [user=" + user + "]";
	}
	
}
