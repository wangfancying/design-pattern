package com.hui.wang.filter.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class BFilter implements Filter{

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.setRequest(request.getRequest() + "BBB");
		chain.doFilter(request, response, chain);
		response.setResponse(response.getResponse() + "BB");
	}
}
