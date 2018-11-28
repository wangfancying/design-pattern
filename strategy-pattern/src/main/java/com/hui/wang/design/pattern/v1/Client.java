package com.hui.wang.design.pattern.v1;

/**
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class Client {

	public static void main(String[] args) {
		MemberStrategy memberStrategy = new IntermediateMemberStrategy();
		Price price = new Price(memberStrategy);
		double qoute = price.quote(12.0);
		System.out.println("折扣后图书的价格：" + qoute);
	}
}
