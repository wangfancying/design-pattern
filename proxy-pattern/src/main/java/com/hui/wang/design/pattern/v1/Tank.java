package com.hui.wang.design.pattern.v1;

/**
 * 目标对象角色
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class Tank implements Moveable{

	@Override
	public void move() {
		System.out.println("moving......");
	}
}
