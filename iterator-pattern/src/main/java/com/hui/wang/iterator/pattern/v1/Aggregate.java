package com.hui.wang.iterator.pattern.v1;

/**
 * 抽象聚集角色类
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public abstract class Aggregate {

	/**
	 * 生成迭代器对象接口
	 *
	 * @return Iterator返回迭代器对象
	 */
	public abstract Iterator createIterator();
}
