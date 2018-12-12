package com.hui.wang.adapter.pattern.v2;

/**
 * 对象的适配器模式
 *
 * @author hui.wang09
 * @since 12 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.handlReq();
	}
}
