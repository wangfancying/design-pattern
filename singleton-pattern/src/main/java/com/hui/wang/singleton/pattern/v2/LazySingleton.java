package com.hui.wang.singleton.pattern.v2;

import java.util.Objects;

/**
 * 懒汉模式
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class LazySingleton {

	private static LazySingleton singleton;

	private LazySingleton() {}

	public static LazySingleton getInstance() {
		if (Objects.isNull(singleton)) {
			synchronized (LazySingleton.class) {
				if (Objects.isNull(singleton)) {
					singleton = new LazySingleton();
				}
			}
		}
		return singleton;
	}
}
