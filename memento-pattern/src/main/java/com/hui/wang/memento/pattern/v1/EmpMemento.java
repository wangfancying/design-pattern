package com.hui.wang.memento.pattern.v1;

/**
 * 备忘录角色
 *
 * @author hui.wang09
 * @since 13 December 2018
 */
public class EmpMemento {

	private String name;
	private String age;

	public EmpMemento(Emp emp) {
		this.name = emp.getName();
		this.age = emp.getAge();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
