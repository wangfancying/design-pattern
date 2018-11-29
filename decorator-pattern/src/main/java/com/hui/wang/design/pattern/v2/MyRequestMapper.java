package com.hui.wang.design.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public class MyRequestMapper extends HttpServletRequestWapper{

	public MyRequestMapper(HttpServletRequest httpServletRequest) {
		super(httpServletRequest);
	}

	@Override
	public String getParameter() {
		String parameter = super.getParameter();
		return parameter.replaceAll("test", "yes");
	}
}
