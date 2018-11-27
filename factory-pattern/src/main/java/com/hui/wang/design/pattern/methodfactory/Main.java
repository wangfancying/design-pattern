package com.hui.wang.design.pattern.methodfactory;

/**
 * 工厂方法模式是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。核心工厂不在负责产品的创建。
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class Main {

	public static void main(String[] args) {
		Fruit appale = new AppleFactory().getInstance();
		appale.print();
	}
}
