package com.hui.wang.design.pattern.v1;

/**
 * 初级会员折扣类
 *
 * @author hui.wang09
 * @since 28 November 2018
 */
public class PrimaryMemberStrategy implements MemberStrategy{

	@Override
	public double calcPrice(double bookPrice) {
		return bookPrice;
	}
}
