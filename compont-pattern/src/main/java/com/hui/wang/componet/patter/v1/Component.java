package com.hui.wang.componet.patter.v1;

/**
 * 抽象构件角色
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public abstract class Component {

	protected String name;

	public Component(String name) {
		this.name = name;
	}

	/**
	 * 增加成员
	 *
	 * @param component 需要添加的成员
	 */
	public abstract void add(Component component);

	/**
	 * 删除成员
	 *
	 * @param component 需要删除的成员
	 */
	public abstract void remove(Component component);

	/**
	 * 业务方法
	 */
	public abstract void display(int depth);
}
