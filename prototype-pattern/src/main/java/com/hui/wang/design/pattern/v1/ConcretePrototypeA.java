package com.hui.wang.design.pattern.v1;

/**
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class ConcretePrototypeA implements Prototype{

	@Override
	public ConcretePrototypeA clone() {
		return new ConcretePrototypeA();
	}
}
