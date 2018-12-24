package com.hui.wang.command.pattern.v1;

/**
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class CommandA implements Command{

	private Receiver receiver = null;

	public CommandA(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.action();
	}
}
