package com.hui.wang.design.pattern.v3;

/**
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class Client {

	public static void main(String[] args) {
		Tank target = new Tank();
		Tank proxy = (Tank) new TankProxy(target).getProxyInstance();
		proxy.move();
	}
}
