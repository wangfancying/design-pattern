package com.hui.wang.observer.pattern.v2;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public class ConcreteObserver implements Observer{

	private String observerState;

	@Override
	public void update(Subject subject) {
		this.observerState = ((ConcreteSubject)subject).getState();
		System.out.println("观察者状态：" + observerState);
	}
}
