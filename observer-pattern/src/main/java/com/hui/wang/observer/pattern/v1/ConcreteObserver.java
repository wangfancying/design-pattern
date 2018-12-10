package com.hui.wang.observer.pattern.v1;

/**
 * 具体观察者角色类
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class ConcreteObserver implements Observer{

	private String observerState;

	@Override
	public void update(String state) {
		this.observerState = state;
		System.out.println(this.observerState);
	}
}
