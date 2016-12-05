package cn.amichina;

import java.util.Arrays;

import com.opensymphony.xwork2.ActionSupport;

public class ModelDrivenAction extends ActionSupport {
	
	private String name;
	private int age;
	private String[] hobby;
	
	@Override
	public String execute() throws Exception {
		System.out.println(name);
		System.out.println(age);
		System.out.println(Arrays.toString(hobby));
		return SUCCESS;
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

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
}
