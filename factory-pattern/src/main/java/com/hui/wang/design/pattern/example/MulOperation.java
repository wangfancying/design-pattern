package com.hui.wang.design.pattern.example;

/**
 * 具体的操作符 -> 乘法
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class MulOperation extends Operation{

	@Override
	public double getResult() {
		return getX() * getY();
	}
}
