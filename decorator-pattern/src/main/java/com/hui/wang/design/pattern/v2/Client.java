package com.hui.wang.design.pattern.v2;

/**
 *
 * 这里简单模拟一下Servlet的设计
 *
 * @author hui.wang09
 * @since 29 November 2018
 */
public class Client {

	public static void main(String[] args) {
		HttpServletRequest request = new HttpServletRequest();
		filter(new MyRequestMapper(request));
	}

	private static void filter(ServletRequest request) {
		System.out.println(request.getParameter());
	}
}
