package com.hui.wang.bridge.pattern.v1;

/**
 * 修正抽象化角色(RefineAbstraction)：拓展抽象化角色，改变和修正父类对抽象化的定义。
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class MyBridge extends Bridge{

	public MyBridge(Driver driver) {
		super(driver);
	}
}
