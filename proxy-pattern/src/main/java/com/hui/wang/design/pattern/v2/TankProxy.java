package com.hui.wang.design.pattern.v2;

import java.lang.reflect.Proxy;

/**
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class TankProxy {

	private Moveable moveable;

	public TankProxy(Moveable moveable) {
		this.moveable = moveable;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(moveable.getClass().getClassLoader(), moveable.getClass().getInterfaces(), (proxy, method, args) -> {
			System.out.println("JDKProxy start......");
			Object object = method.invoke(moveable, args);
			System.out.println("JDKProxy start......");
			return object;
		});
	}
}
