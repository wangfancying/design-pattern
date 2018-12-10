package com.hui.wang.observer.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 10 December 2018
 */
public class ConcreteSubject extends Subject{

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void change(String newState) {
		System.out.println("主题状态" + newState);
		this.state = newState;
		this.notify(newState);
	}
}
