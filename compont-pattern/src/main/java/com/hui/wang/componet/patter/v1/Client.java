package com.hui.wang.componet.patter.v1;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Composite root = new Composite("root");

		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));

		Composite composite = new Composite("Composite X");
		composite.add(new Leaf("Leaf XA"));
		composite.add(new Leaf("Leaf XB"));
		root.add(composite);

		root.display(1);
	}
}
