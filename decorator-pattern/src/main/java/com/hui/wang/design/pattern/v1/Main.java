package com.hui.wang.design.pattern.v1;

/**
 * client
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public class Main {


	/**
	 * 注意是：
	 * 		DecoratorCar flyCar = new FlyCar(myCar);
	 *	 	flyCar.move();
	 *	 	System.out.println("=======================");
	 *
	 * 		DecoratorCar waterCar = new WaterCar(myCar);
	 * 		waterCar.move();
	 * 		System.out.println("=======================");
	 *
	 * 	而不是：
	 *
	 * 		FlyCar flyCar = new FlyCar(myCar);
	 *	 	flyCar.move();
	 *	 	System.out.println("=======================");
	 *
	 * 		WaterCar waterCar = new WaterCar(myCar);
	 * 		waterCar.move();
	 * 		System.out.println("=======================");
	 *
	 */
	public static void main(String[] args) {
		MyCar myCar = new MyCar();
		myCar.move();
		System.out.println("=======================");

		DecoratorCar flyCar = new FlyCar(myCar);
		flyCar.move();
		System.out.println("=======================");

		DecoratorCar waterCar = new WaterCar(myCar);
		waterCar.move();
		System.out.println("=======================");
	}
}
