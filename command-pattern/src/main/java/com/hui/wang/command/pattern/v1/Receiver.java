package com.hui.wang.command.pattern.v1;

/**
 * 接收者角色类
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Receiver {

	/**
	 * 真正执行命令相应的操作
	 */
	public void action() {
		System.out.println("执行操作");
	}
}
