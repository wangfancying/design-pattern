package com.hui.wang.design.pattern.example;

/**
 * 封装 、继承 、多态 牢记
 * 简单工厂模式的使用，编写一个计算器程序
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class Main {

	public static void main(String[] args) {
		Operation operation = OperationFactory.createOperation(OperatorEnum.ADD);
		operation.setX(2);
		operation.setY(7);
		System.out.println(operation.getResult());
	}
}
