package com.hui.wang.visitor.pattern;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 27 December 2018
 */
public class Main {

	public static void main(String[] args) {
		Element javaElement = new JavaElement("java", "work");
		Visitor visitor = new ConcreteVisitor();

		javaElement.Accept(visitor);
	}
}
