package com.hui.wang.iterator.pattern.v1;

/**
 * 具体聚集角色类，实现了抽象聚集角色所要求的接口
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public class ConcreteAggregate extends Aggregate{

	private Object[] objects = null;

	public ConcreteAggregate(Object[] objects) {
		this.objects = objects;
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator();
	}

	/**
	 * 内部成员类，具体迭代子类
	 */
	private class ConcreteIterator implements Iterator {

		/**内部索引，记录当前迭代到的索引位置*/
		private int index = 0;
		/**记录当前聚集对象的大小*/
		private int size = 0;

		public ConcreteIterator() {
			this.size = objects.length;
			this.index = 0;
		}

		@Override
		public void first() {
			index = 0;
		}

		@Override
		public void next() {
			if (index < size) {
				index ++;
			}
		}

		@Override
		public boolean isDone() {
			return index >= size;
		}

		@Override
		public Object currentItem() {
			return objects[index];
		}
	}
}
