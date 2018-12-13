package com.hui.wang.memento.pattern.v1;

/**
 * 发起者角色
 *
 * @author hui.wang09
 * @since 13 December 2018
 */
public class Emp {

	private String name;
	private String age;


	/**
	 * 进行备份操作，并返回一个备忘录对象
	 */
	public EmpMemento memento() {
		return new EmpMemento(this);
	}

	/**
	 * 进行数据恢复，恢复成备忘录中对象的值
	 */
	public void recovery(EmpMemento empMemento) {
		this.name = empMemento.getName();
		this.age = empMemento.getAge();
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
