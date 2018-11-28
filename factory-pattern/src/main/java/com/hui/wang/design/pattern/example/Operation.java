package com.hui.wang.design.pattern.example;

/**
 * 抽象计算器的操作符
 * 这里使用了策略模式，具体的算法实现放到了具体的算法实现类中了
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public abstract class Operation {

	private double x;
	private double y;

	/**
	 * 抽象的算法
	 */
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
