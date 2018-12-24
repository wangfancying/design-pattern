package com.hui.wang.command.pattern.v2;

import java.util.ArrayList;
import java.util.List;

import com.hui.wang.command.pattern.v1.Command;

/**
 * 具体的宏命令
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class MacroConcreteCommand implements MacroCommand{

	private List<Command> commands = new ArrayList<>();

	@Override
	public void add(Command command) {
		commands.add(command);
	}

	@Override
	public void remove(Command command) {
		commands.remove(command);
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}
}
