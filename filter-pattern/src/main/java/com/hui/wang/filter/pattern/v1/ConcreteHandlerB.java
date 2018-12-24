package com.hui.wang.filter.pattern.v1;

/**
 * 具体处理者角色
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class ConcreteHandlerB extends Handler {

	@Override
	public void handleRequest() {
		if (getHandler() != null) {
			System.out.println("后面处理");
			getHandler().handleRequest();
			return;
		}

		System.out.println("B处理请求");
	}
}
