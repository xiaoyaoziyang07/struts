package cn.amichina;

import com.opensymphony.xwork2.ActionSupport;

public class FirstAction extends ActionSupport {

	private String name;
	private int age;
	private String password;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	@Override
	public void validate() {
		if(name.length()<5){
			addFieldError("nameError", "必须超过五个字符");
		}
		if(age<18){
			addFieldError("ageError", "必须大于18岁");
		}
		if(password.trim().length()<6){
			addFieldError("passwordError", "密码必须超过六位");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
