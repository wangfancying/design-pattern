package com.hui.wang.singleton.pattern.v3;

/**
 * 内部类的方式
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class InnerClass {

	private InnerClass() {}

	private static class Inner {
		public static InnerClass innerClass = new InnerClass();
	}

	public static InnerClass getInstance() {
		return Inner.innerClass;
	}
}
