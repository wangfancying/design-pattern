package com.hui.wang.design.pattern.v1;

/**
 * 简单形式的原型模式
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class Client {

	private Prototype prototype;

	public Client(Prototype prototype) {
		this.prototype = prototype;
	}

	public Prototype operation() {
		return (Prototype) this.prototype.clone();
	}
}
