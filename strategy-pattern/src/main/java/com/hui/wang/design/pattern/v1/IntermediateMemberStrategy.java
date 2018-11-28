package com.hui.wang.design.pattern.v1;

/**
 * 中级会员折扣类
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class IntermediateMemberStrategy implements MemberStrategy{

	private static final double CALC = 0.9;

	@Override
	public double calcPrice(double bookPrice) {
		return bookPrice * CALC;
	}
}
