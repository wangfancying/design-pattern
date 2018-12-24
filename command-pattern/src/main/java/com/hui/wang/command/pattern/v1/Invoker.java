package com.hui.wang.command.pattern.v1;

/**
 * 请求者角色类
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Invoker {

	private Command command = null;

	public Invoker(Command command) {
		this.command = command;
	}

	public void action() {
		this.command.execute();
	}
}
