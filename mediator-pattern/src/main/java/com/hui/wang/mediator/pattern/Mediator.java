package com.hui.wang.mediator.pattern;

/**
 * 具体的中介者
 *
 * @author hui.wang09
 * @since 24 December 2018
 */
public class Mediator extends AbstractMediator{

	private AbstractColleague colleagueA;
	private AbstractColleague colleagueB;

	public Mediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
		this.colleagueA = colleagueA;
		this.colleagueB = colleagueB;
	}

	@Override
	public void affectB() {
		int number = colleagueA.getNumber();
		colleagueB.setNumber(number * 100);
	}

	@Override
	public void affectA() {
		int number = colleagueB.getNumber();
		colleagueA.setNumber(number / 100);
	}
}
