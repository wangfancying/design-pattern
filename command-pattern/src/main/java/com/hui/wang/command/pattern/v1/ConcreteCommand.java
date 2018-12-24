package com.hui.wang.command.pattern.v1;

/**
 * 具体命令角色类
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class ConcreteCommand implements Command{

	private Receiver receiver = null;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.action();
	}
}
