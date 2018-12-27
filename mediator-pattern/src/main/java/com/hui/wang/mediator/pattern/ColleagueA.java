package com.hui.wang.mediator.pattern;

/**
 * 同事A
 *
 * @author hui.wang09
 * @since 24 December 2018
 */
public class ColleagueA extends AbstractColleague{

	@Override
	public void setNumber(int number, AbstractMediator abstractMediator) {
		this.number = number;
		abstractMediator.affectB();
	}
}
