package com.hui.wang.design.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class Client {

	public static void main(String[] args) {
		Moveable target = new Tank();
		Moveable proxy = (Moveable) new TankProxy(target).getProxyInstance();
		proxy.move();
	}
}
