package com.hui.wang.observer.pattern.v1;

/**
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer = new ConcreteObserver();
		subject.attach(observer);

		subject.change("this");
		System.out.println(observer);
	}
}
