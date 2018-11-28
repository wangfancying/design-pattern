package com.hui.wang.design.pattern.v2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 排序工具类
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class SortUtils {

	/**
	 * 排序工具类
	 * @param list 排序对象的list
	 * @param comparator 比较器
	 * @return 返回按照计较器排序后的对象list
	 */
	public static <T> List<T> sort(List<T> list, Comparator<T> comparator) {
		if (Objects.isNull(comparator)) {
			return list;
		}
		List<T> sortList = list.stream().sorted(comparator::compare).collect(Collectors.toList());
		return sortList;
	}
}
