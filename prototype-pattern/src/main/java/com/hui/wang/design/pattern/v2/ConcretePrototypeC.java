package com.hui.wang.design.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class ConcretePrototypeC implements Prototype{

	private String name;

	@Override
	public Prototype clone() {
		ConcretePrototypeC prototype = new ConcretePrototypeC();
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
		return "ConcretePrototypeC{" +
				"name='" + name + '\'' +
				'}';
	}
}
