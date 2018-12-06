package com.hui.wang.design.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class ConcretePrototypeD implements Prototype{

	private String name;

	@Override
	public Prototype clone() {
		ConcretePrototypeD prototype = new ConcretePrototypeD();
		prototype.setName(this.name);
		return prototype;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ConcretePrototypeD{" +
				"name='" + name + '\'' +
				'}';
	}
}
