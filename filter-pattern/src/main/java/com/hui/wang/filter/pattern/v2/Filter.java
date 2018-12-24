package com.hui.wang.filter.pattern.v2;

/**
 * 定义接口Filter,具体的过滤规则需要实现这个接口
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public interface Filter {

	/**
	 * 处理接口
	 */
	void doFilter(Request request, Response response, FilterChain chain);
}
