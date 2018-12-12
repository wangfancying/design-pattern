package com.hui.wang.adapter.pattern.v1;

/**
 * 类的适配器模式
 *
 * @author hui.wang09
 * @since 12 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		target.handlReq();
	}
}
