package com.hui.wang.singleton.pattern.v1;

/**
 * 饥汉模式
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return singleton;
	}
}
