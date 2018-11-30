package com.hui.wang.design.pattern.v1;

/**
 * 代理对象角色，使用继承实现
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class TankOne extends Tank{

	@Override
	public void move() {
		System.out.println("继承实现");
		super.move();
		System.out.println("继承实现");
	}
}
