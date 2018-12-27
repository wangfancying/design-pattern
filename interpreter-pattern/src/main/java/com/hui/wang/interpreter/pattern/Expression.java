package com.hui.wang.interpreter.pattern;

/**
 * 抽象表达式角色
 *
 * <b>声明一个所有的具体表达式角色都需要实现的抽象接口。这个接口主要是一个interpret()方法，称做解释操作。</b>
 *
 * @author hui.wang09
 * @since 25 December 2018
 */
public interface Expression {

	/**
	 * 以环境为准，本方法解释给定的任何一个表达式
	 *
	 * @param context 环境
	 * @return true of false
	 */
	boolean interpret(Context context);
}
