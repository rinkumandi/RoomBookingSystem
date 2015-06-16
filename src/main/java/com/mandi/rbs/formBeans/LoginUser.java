package com.mandi.rbs.formBeans;

import javax.validation.constraints.Size;

public class LoginUser {

	@Size(min = 4, max = 4)
	private String userId;

	@Size(min = 5, max = 15)
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginUser [userId=" + userId + ", password=" + password + "]";
	}

}
