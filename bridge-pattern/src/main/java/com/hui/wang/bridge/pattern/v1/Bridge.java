package com.hui.wang.bridge.pattern.v1;

/**
 * 抽象化角色(Abstraction)：抽象化给出的定义，并保存一个对实现化对象的引用
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public abstract class Bridge {

	private Driver driver;

	public void getConnect() {
		driver.connect();
	}

	public Bridge(Driver driver) {
		this.driver = driver;
	}
}
