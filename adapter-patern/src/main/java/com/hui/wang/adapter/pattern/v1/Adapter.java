package com.hui.wang.adapter.pattern.v1;

/**
 * 适配器
 *
 * @author hui.wang09
 * @since 12 December 2018
 */
public class Adapter extends Adaptee implements Target{

	@Override
	public void handlReq() {
		super.request();
	}
}
