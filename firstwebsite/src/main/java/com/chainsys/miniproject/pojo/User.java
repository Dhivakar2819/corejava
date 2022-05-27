package com.chainsys.miniproject.pojo;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
public class User implements HttpSessionBindingListener {
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("Value bound "+arg0.getName());
		System.out.println("Value : "+arg0.getValue().getClass().getName());
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("Value Unbound "+arg0.getName());
		
	}
	private String userId;
	private String Password;
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
