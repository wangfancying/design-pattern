package com.hui.wang.interpreter.pattern;

/**
 * 一个Constant对象代表一个布尔常量
 *
 * <b>实现了抽象表达式角色所要求的接口，主要是一个interpret()方法；
 * 文法中的每一个终结符都有一个具体终结表达式与之相对应。
 * 比如有一个简单的公式R=R1+R2，在里面R1和R2就是终结符，对应的解析R1和R2的解释器就是终结符表达式。</b>
 *
 * @author hui.wang09
 * @since 25 December 2018
 */
public class Constant implements Expression{

	private boolean value;

	public Constant(boolean value) {
		this.value = value;
	}

	@Override
	public boolean interpret(Context context) {
		return value;
	}

	@Override
	public String toString() {
		return new Boolean(value).toString();
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Constant) {
			return this.value = ((Constant)obj).value;
		}
		return false;
	}
}
