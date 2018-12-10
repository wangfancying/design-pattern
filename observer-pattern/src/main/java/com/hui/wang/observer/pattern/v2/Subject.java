package com.hui.wang.observer.pattern.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 10 December 2018
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
	 */
	public void notify(String newSate) {
		list.forEach( o -> o.update(this));
	}

}
