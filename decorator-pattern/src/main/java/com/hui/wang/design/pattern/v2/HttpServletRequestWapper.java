package com.hui.wang.design.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public class HttpServletRequestWapper implements ServletRequest{

	private HttpServletRequest httpServletRequest;

	public HttpServletRequestWapper(HttpServletRequest httpServletRequest) {
		this.httpServletRequest = httpServletRequest;
	}

	@Override
	public String getParameter() {
		return this.httpServletRequest.getParameter();
	}
}
