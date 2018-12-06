package com.hui.wang.design.pattern.v2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class PrototypeManager {

	private static Map<String, Prototype> map = new HashMap<>();

	private PrototypeManager() {
	}

	public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
		map.put(prototypeId, prototype);
	}

	public synchronized static void removePrototype(String prototypeId) {
		map.remove(prototypeId);
	}

	public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
		Prototype prototype = map.get(prototypeId);
		if (prototype == null) {
			throw new Exception("原型没有注册或者被销毁");
		}
		return prototype;
	}
}
