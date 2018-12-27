package com.hui.wang.interpreter.pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境(Context)类定义出从变量到布尔值的一个映射
 *
 * <b>这个角色的任务一般是用来存放文法中各个终结符所对应的具体值，
 * 比如R=R1+R2，我们给R1赋值100，给R2赋值200。这些信息需要存放到环境角色中，很多情况下我们使用Map来充当环境角色就足够了</b>
 *
 * @author hui.wang09
 * @since 25 December 2018
 */
public class Context {

	private Map<Variable, Boolean> map = new HashMap<>();

	public void assign(Variable variable, boolean value) {
		map.put(variable, new Boolean(value));
	}

	public boolean lookup(Variable variable){
		Boolean value = map.get(variable);
		if (value == null) {
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}
}
