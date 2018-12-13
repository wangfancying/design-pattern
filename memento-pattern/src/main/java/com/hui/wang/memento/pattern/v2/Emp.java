package com.hui.wang.memento.pattern.v2;

/**
 * 发起者角色
 *
 * @author hui.wang09
 * @since 13 December 2018
 */
public class Emp {

	private String name;
	private String age;


	/**
	 * 进行备份操作，并返回一个备忘录对象
	 */
	public Memento memento() {
		return new EmpMemento(this);
	}

	/**
	 * 进行数据恢复，恢复成备忘录中对象的值
	 */
	public void recovery(Memento empMemento) {
		this.name = ((EmpMemento)empMemento).getName();
		this.age = ((EmpMemento)empMemento).getAge();
	}

	/**
	 * 备忘录角色
	 * 内部类的方式实现备忘录角色，减少外部访问
	 */
	private class EmpMemento implements Memento{

		private String name;
		private String age;

		public EmpMemento(Emp emp) {
			this.name = emp.getName();
			this.age = emp.getAge();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}
