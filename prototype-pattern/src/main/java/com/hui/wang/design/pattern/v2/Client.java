package com.hui.wang.design.pattern.v2;

/**
 * 登记形式的原型模式
 * 作为原型模式的第二种形式，它多了一个原型管理器(PrototypeManager)角色，该角色的作用是：创建具体原型类的对象，并记录每一个被创建的对象。
 *
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class Client {

	public static void main(String[] args) throws Exception {
		Prototype prototype = new ConcretePrototypeC();
		PrototypeManager.setPrototype("p1", prototype);

		Prototype prototype1 = PrototypeManager.getPrototype("p1").clone();
		prototype1.setName("张三");
		System.out.println("第一个实例：" + prototype1);

		//有人动态的切换了实现
		Prototype p2 = new ConcretePrototypeD();
		PrototypeManager.setPrototype("p1", p2);
		//重新获取原型来创建对象
		Prototype p4 = PrototypeManager.getPrototype("p1").clone();
		p4.setName("李四");
		System.out.println("第二个实例：" + p4);

		//有人注销了这个原型
		PrototypeManager.removePrototype("p1");
		//再次获取原型来创建对象
		Prototype p5 = PrototypeManager.getPrototype("p1").clone();
		p5.setName("王五");
		System.out.println("第三个实例：" + p5);
	}
}
