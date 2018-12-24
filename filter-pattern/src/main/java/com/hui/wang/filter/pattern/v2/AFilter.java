package com.hui.wang.filter.pattern.v2;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class AFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequest(request.getRequest() + "AAAA");
		chain.doFilter(request, response, chain);
	}
}
