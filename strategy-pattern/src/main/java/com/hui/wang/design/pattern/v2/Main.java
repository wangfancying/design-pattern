package com.hui.wang.design.pattern.v2;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

/**
 * 策略模式的升级版
 * 这里将不存在环境角色，降低代码耦合度
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class Main {

	public static void main(String[] args) {
		Person o1 = new Person(11, "hui");
		Person o2 = new Person(12, "wang");
		Person o3 = new Person(9, "test");
		List<Person> list = Lists.newArrayList(o1, o2 ,o3);

		List<Person> sortList = SortUtils.sort(list, new HightComparator());
		System.out.println(JSON.toJSONString(sortList));
	}
}
