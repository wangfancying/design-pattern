package com.hui.wang.bridge.pattern.v1;

/**
 * 具体实现化角色(ConcreteImplementor)
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class MysqlDriver implements Driver{

	@Override
	public void connect() {
		System.out.println("MySQL连接");
	}
}
