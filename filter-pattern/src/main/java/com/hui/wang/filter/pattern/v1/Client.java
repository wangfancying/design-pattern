package com.hui.wang.filter.pattern.v1;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Handler handler = new ConcreteHandlerA();
		Handler handler1 = new ConcreteHandlerB();
		handler.setHandler(handler1);

		handler.handleRequest();
	}
}
