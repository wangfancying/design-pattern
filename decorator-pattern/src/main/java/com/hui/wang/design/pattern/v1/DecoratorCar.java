package com.hui.wang.design.pattern.v1;

/**
 * 装饰角色 Decorator
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public abstract class DecoratorCar implements Car{

	/**
	 * 持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口
	 */
	private Car car;

	public DecoratorCar(Car car) {
		this.car = car;
	}

	@Override
	public void move() {
		car.move();
	}
}
