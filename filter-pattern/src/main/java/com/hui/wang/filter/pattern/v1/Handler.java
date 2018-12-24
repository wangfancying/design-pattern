package com.hui.wang.filter.pattern.v1;

/**
 * 抽象处理者角色
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public abstract class Handler {

	protected Handler handler;

	/**
	 * 示意处理请求的方法，虽然这个示意方法是没有传入参数的
	 * 但实际是可以传入参数的，根据具体需要来选择是否传递参数
	 */
	public abstract void handleRequest();

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
}
