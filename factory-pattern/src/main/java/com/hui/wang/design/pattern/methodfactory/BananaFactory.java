package com.hui.wang.design.pattern.methodfactory;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class BananaFactory implements FruitFactory{

	public Fruit getInstance() {
		return new Banana();
	}
}
