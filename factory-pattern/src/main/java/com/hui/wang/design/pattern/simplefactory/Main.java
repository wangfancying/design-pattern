package com.hui.wang.design.pattern.simplefactory;

/**
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		Fruit apple = SimpleFactory.getInstance(Apple.class);
		apple.print();
	}
}
