package cn.amichina.model;

import java.util.Date;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class User implements HttpSessionBindingListener{

	private String name;
	private String password;
	
	public User() {
		super();
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public void valueBound(HttpSessionBindingEvent event) {
		System.out.println(name+"登陆了"+new Date());
	}

	public void valueUnbound(HttpSessionBindingEvent event) {
		System.out.println(name+"下线了"+new Date());
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
