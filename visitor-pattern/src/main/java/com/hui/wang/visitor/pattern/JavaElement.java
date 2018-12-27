package com.hui.wang.visitor.pattern;

/**
 * 具体元素
 *
 * @author hui.wang09
 * @since 27 December 2018
 */
public class JavaElement implements Element{

	private String name;
	private String work;

	public JavaElement(String name, String work) {
		this.name = name;
		this.work = work;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getWork() {
		return this.work;
	}

	@Override
	public void Accept(Visitor visitor) {
		visitor.visit(this);
	}
}
