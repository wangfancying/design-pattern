package com.hui.wang.componet.patter.v1;

/**
 * 叶子构件
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("Can not add to a leaf");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Can not remove from a leaf");
	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++) {
			temp += '-';
		}
		System.out.println(temp + name);
	}
}
