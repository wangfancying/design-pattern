package com.hui.wang.interpreter.pattern;

/**
 * 一个Variable对象代表一个有名变量
 *
 * @author hui.wang09
 * @since 25 December 2018
 */
public class Variable implements Expression{

	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public boolean interpret(Context context) {
		return context.lookup(this);
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Variable) {
			return this.name.equals(((Variable)obj).name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
