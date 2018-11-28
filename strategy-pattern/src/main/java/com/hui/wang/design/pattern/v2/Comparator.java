package com.hui.wang.design.pattern.v2;

/**
 * 抽象排序策略
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public interface Comparator<T> {

	/**
	 * 比较两个对象的大小
	 * @param o1 对象1
	 * @param o2 对象2
	 * @return 	如果o1对象大于o2对象，返回1
	 * 			如果o1对象小于o2对象，返回-1
	 * 			如果o1对象等于o2对象，返回0
	 */
	int compare(T o1, T o2);
}
