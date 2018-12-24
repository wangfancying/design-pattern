package com.hui.wang.filter.pattern.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链条
 *
 * @author hui.wang09
 * @since 18 December 2018
 */
public class FilterChain implements Filter{

	List<Filter> filters = new ArrayList<>();

	int index = 0;

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	@Override
	public void doFilter(Request request, Response response, FilterChain filterChain) {
		if (index == filters.size()) {
			return;
		}
		Filter filter = filters.get(index);
		index ++;
		filter.doFilter(request, response, filterChain);
	}
}
