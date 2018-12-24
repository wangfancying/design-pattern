package com.hui.wang.iterator.pattern.v1;

/**
 * 抽象迭代器角色
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public interface Iterator {

	/**
	 * 移动到第一个元素
	 */
	void first();

	/**
	 * 移动到下一个元素
	 */
	void next();

	/**
	 * 是否是最后一个元素
	 */
	boolean isDone();

	/**
	 * 返回当前元素
	 *
	 * @return a object 当前对象
	 */
	Object currentItem();
}
