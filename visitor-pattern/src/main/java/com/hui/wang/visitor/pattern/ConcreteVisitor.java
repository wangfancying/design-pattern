package com.hui.wang.visitor.pattern;

/**
 * 具体的访问者
 *
 * @author hui.wang09
 * @since 27 December 2018
 */
public class ConcreteVisitor implements Visitor{

	@Override
	public void visit(Element element) {
		System.out.println("访问者获取信息:" + element.getName() + "," + element.getWork());
	}
}
