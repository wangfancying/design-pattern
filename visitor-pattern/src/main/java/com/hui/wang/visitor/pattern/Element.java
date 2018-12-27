package com.hui.wang.visitor.pattern;

/**
 * 定义一个接受访问操作类，访问者(Visitor)操作函数的参数。
 *
 * @author hui.wang09
 * @since 27 December 2018
 */
public interface Element {

	String getName();

	String getWork();

	/**
	 * 访问者访问接口
	 */
	void Accept(Visitor visitor);
}
