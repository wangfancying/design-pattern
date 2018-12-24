package com.hui.wang.filter.pattern.v2;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Request request = new Request();
		request.setRequest("request");

		Response response = new Response();
		response.setResponse("response");

		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new AFilter());
		filterChain.addFilter(new BFilter());

		filterChain.doFilter(request, response, filterChain);
		System.out.println(request.getRequest());
		System.out.println(response.getResponse());
	}
}
