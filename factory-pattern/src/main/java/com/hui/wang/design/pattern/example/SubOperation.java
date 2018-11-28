package com.hui.wang.design.pattern.example;

/**
 * 具体的操作符 -> 减法
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class SubOperation extends Operation{

	@Override
	public double getResult() {
		return getX() - getY();
	}
}
