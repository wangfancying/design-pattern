package com.hui.wang.memento.pattern;

/**
 *
 * @author hui.wang09
 * @since 13 December 2018
 */
public class Client {

	public static void main(String[] args) {

		//创建管理者
		CareTaker careTaker = new CareTaker();

		//创建对象
		Emp emp = new Emp();
		emp.setAge("11");
		emp.setName("yes");
		System.out.println("对象："+emp.getName()+"----"+emp.getAge());

		//进行备份
		careTaker.setEmpMemento(emp.memento());

		emp.setName("no");
		System.out.println("对象："+emp.getName()+"----"+emp.getAge());

		//数据恢复
		emp.recovery(careTaker.getEmpMemento());
		System.out.println("对象："+emp.getName()+"----"+emp.getAge());
	}
}
