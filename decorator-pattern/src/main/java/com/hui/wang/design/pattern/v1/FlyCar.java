package com.hui.wang.design.pattern.v1;

/**
 * 具体装饰角色 ConcreteDecorator
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public class FlyCar extends DecoratorCar{


	public FlyCar(Car car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("可以飞");
	}
}
