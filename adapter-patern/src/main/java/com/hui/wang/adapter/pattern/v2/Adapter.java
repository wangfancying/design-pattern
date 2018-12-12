package com.hui.wang.adapter.pattern.v2;

/**
 * 适配器
 *
 * @author hui.wang09
 * @since 12 December 2018
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void handlReq() {
		adaptee.request();
	}
}
