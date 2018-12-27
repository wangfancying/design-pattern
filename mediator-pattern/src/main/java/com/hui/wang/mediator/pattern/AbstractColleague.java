package com.hui.wang.mediator.pattern;

/**
 * 抽象同事类
 *
 * @author hui.wang09
 * @since 24 December 2018
 */
public abstract class AbstractColleague {

	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public abstract void setNumber(int number, AbstractMediator abstractMediator);
}
