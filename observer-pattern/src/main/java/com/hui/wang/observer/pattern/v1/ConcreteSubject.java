package com.hui.wang.observer.pattern.v1;

/**
 * 具体的主题角色
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class ConcreteSubject extends Subject{

	private String state;

	public String getState() {
		return state;
	}

	public void change(String newState) {
		this.state = newState;
		this.notify(newState);
	}
}
