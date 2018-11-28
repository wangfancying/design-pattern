package com.hui.wang.design.pattern.v2;

/**
 * 具体实现排序的算法
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class HightComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		}
		if (o1.getAge() < o2.getAge()) {
			return -1;
		}
		return 0;
	}
}
