package com.hui.wang.design.pattern.v2;

/**
 * person 实体
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class Person {

	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
