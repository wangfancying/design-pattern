package com.hui.wang.memento.pattern.v2;

/**
 * 管理者角色
 * 负责管理备忘录类,示例只保存了一个备忘录对象，可以通过设置栈保存多个对象
 *
 * @author hui.wang09
 * @since 13 December 2018
 */
public class CareTaker {

	private Memento memento;

	public Memento getEmpMemento() {
		return memento;
	}

	public void setEmpMemento(Memento memento) {
		this.memento = memento;
	}
}
