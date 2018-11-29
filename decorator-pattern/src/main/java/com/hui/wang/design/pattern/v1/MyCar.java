package com.hui.wang.design.pattern.v1;

/**
 * 具体组件角色 ConcreteComponent
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public class MyCar implements Car{

	@Override
	public void move() {
		System.out.println("简单的move");
	}
}
