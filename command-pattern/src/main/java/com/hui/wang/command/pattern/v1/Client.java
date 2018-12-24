package com.hui.wang.command.pattern.v1;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
