package com.hui.wang.design.pattern.v1;

/**
 * 代理对象角色，使用聚合实现
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class TankTwo implements Moveable{

	private Moveable moveable;

	public TankTwo(Moveable moveable) {
		this.moveable = moveable;
	}

	@Override
	public void move() {
		System.out.println("聚合实现");
		moveable.move();
		System.out.println("聚合实现");
	}
}
