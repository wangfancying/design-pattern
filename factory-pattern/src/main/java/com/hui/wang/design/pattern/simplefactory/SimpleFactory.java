package com.hui.wang.design.pattern.simplefactory;

/**
 * 简单工厂模式
 * 使用简单工厂模式创建各种各样的水果
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class SimpleFactory {

	public static Fruit getInstance(Class type) throws IllegalAccessException, InstantiationException {
		return (Fruit)type.newInstance();
	}
}
