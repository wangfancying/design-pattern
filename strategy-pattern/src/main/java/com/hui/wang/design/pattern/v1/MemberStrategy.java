package com.hui.wang.design.pattern.v1;

/**
 * 抽象折扣类
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public interface MemberStrategy {

	/**
	 * 计算图书的价格
	 * @param bookPrice 图书的价格
	 * @return 返回折扣后的价格
	 */
	public double calcPrice(double bookPrice);
}
