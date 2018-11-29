package com.hui.wang.design.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public class HttpServletRequest implements ServletRequest{

	@Override
	public String getParameter() {
		return "test";
	}
}
