package com.hui.wang.observer.pattern.v1;

/**
 * 抽象观察者角色类
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public interface Observer {

	/**
	 * 更新接口
	 *
	 * @param state 更新的状态
	 */
	void update(String state);
}
