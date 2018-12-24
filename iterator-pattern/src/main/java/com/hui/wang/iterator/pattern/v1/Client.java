package com.hui.wang.iterator.pattern.v1;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Object[] objects = {"one", "two", "three"};
		Aggregate aggregate = new ConcreteAggregate(objects);
		Iterator iterator = aggregate.createIterator();
		while (!iterator.isDone()) {
			System.out.println(iterator.currentItem());
			iterator.next();
		}
	}
}
