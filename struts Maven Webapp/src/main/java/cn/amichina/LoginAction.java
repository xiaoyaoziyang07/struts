package cn.amichina;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cn.amichina.model.User;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String name;
	private String password;

	public String login() {
			User user = new User(name, password);
			HttpSession session = ServletActionContext.getRequest().getSession();
			session.setAttribute(user.getName(), user);
			return SUCCESS;
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
