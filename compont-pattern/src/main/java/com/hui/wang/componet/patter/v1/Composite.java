package com.hui.wang.componet.patter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件
 *
 * @author hui.wang09
 * @since 17 December 2018
 */
public class Composite extends Component{

	/**保存组件*/
	private List<Component> children = new ArrayList<>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		String temp = "";
		for (int i = 0; i < depth; i++) {
			temp += '-';
		}

		System.out.println(temp + name);

		for (Component c : children) {
			c.display(depth + 2);
		}
	}
}
