package com.hui.wang.design.pattern.v1;

/**
 * 价格类
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class Price {

	/**
	 * 持有一个策略对象
	 */
	private MemberStrategy memberStrategy;

	/**
	 * 构造器
	 * @param memberStrategy 策略对象
	 */
	public Price(MemberStrategy memberStrategy) {
		this.memberStrategy = memberStrategy;
	}

	/**
	 * 默认构造器
	 */
	public Price() {
	}

	/**
	 * 计算折扣后图书的价格
	 * @param bookPrice 图书原价
	 */
	public double quote(double bookPrice) {
		return memberStrategy.calcPrice(bookPrice);
	}
}
