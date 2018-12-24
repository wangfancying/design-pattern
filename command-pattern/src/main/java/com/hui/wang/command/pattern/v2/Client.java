package com.hui.wang.command.pattern.v2;

import com.hui.wang.command.pattern.v1.Command;
import com.hui.wang.command.pattern.v1.CommandA;
import com.hui.wang.command.pattern.v1.ConcreteCommand;
import com.hui.wang.command.pattern.v1.Invoker;
import com.hui.wang.command.pattern.v1.Receiver;

/**
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Command command1 = new CommandA(receiver);

		MacroCommand macroCommand = new MacroConcreteCommand();
		macroCommand.add(command);
		macroCommand.add(command1);

		Invoker invoker = new Invoker(macroCommand);
		invoker.action();
	}
}
