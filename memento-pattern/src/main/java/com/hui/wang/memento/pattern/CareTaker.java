package com.hui.wang.memento.pattern;

/**
 * 管理者角色
 * 负责管理备忘录类,示例只保存了一个备忘录对象，可以通过设置栈保存多个对象
 *
 * @author hui.wang09
 * @since 13 December 2018
 */
public class CareTaker {

	private EmpMemento empMemento;

	public EmpMemento getEmpMemento() {
		return empMemento;
	}

	public void setEmpMemento(EmpMemento empMemento) {
		this.empMemento = empMemento;
	}
}
