package com.chainsys.miniproject.listeners;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
public class SessionListener implements HttpSessionBindingListener{

	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		System.out.println("Session Created");
		HttpSession session=arg0.getSession();
		System.out.println("Session id "+session.getId());
		session.setMaxInactiveInterval(60*10);
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		System.out.println("Session Destroyed");
		HttpSession session=arg0.getSession();
		System.out.println("Session id "+session.getId());
	}

}
