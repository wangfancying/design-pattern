package com.hui.wang.design.pattern.v1;

/**
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class Main {

	public static void main(String[] args) {
		//目标对象
		Tank target = new Tank();

		//代理对象
		TankTwo proxy = new TankTwo(target);
		proxy.move();
	}
}
