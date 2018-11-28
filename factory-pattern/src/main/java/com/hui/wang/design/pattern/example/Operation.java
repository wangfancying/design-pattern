package com.hui.wang.design.pattern.example;

/**
 * 抽象计算器的操作符
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public abstract class Operation {

	private double x;
	private double y;

	public abstract double getResult();

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
