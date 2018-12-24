package com.hui.wang.command.pattern.v2;

import com.hui.wang.command.pattern.v1.Command;

/**
 * 宏命令
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public interface MacroCommand extends Command{

	/**
	 * 宏命令聚集的管理方法
	 * 可以添加一个成员命令
	 */
	void add(Command command);

	/**
	 * 宏命令聚集的管理方法
	 * 可以删除一个成员命令
	 */
	void remove(Command command);
}
