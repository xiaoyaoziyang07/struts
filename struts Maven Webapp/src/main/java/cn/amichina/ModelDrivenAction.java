package cn.amichina;

import cn.amichina.model.People;

import com.opensymphony.xwork2.ActionSupport;

public class ModelDrivenAction extends ActionSupport {
	
	private People people;

	@Override
	public String execute() throws Exception {
		System.out.println(people.getName());
		System.out.println(people.getAge());
		return SUCCESS;
	}

	public People getPeople() {
		return people;
	}

	public void setPeople(People people) {
		this.people = people;
	}
	
	

}
