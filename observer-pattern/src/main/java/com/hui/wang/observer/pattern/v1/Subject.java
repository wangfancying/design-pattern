package com.hui.wang.observer.pattern.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题角色类
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public abstract class Subject {

	/**保存注册的观察者对象*/
	List<Observer> list = new ArrayList<>();


	/**
	 * 注册观察者对象
	 *
	 * @param observer 观察者对象
	 */
	public void attach(Observer observer) {
		list.add(observer);
	}

	/**
	 * 注销观察者对象
	 *
	 * @param observer 观察者对象
	 */
	public void detach(Observer observer) {
		list.remove(observer);
	}

	/**
	 * 通知所有的观察者
	 *
	 * @param newState 新的状态
	 */
	public void notify(final String  newState) {
		list.forEach( o -> o.update(newState));
	}
}
