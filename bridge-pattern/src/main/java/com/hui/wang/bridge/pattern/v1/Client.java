package com.hui.wang.bridge.pattern.v1;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Driver mysqlDriver = new MysqlDriver();
		Bridge myBridge = new MyBridge(mysqlDriver);
		myBridge.getConnect();
	}
}
