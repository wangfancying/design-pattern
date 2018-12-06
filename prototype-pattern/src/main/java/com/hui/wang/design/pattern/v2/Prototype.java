package com.hui.wang.design.pattern.v2;

/**
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public interface Prototype {

	public Prototype clone();

	public String getName();

	public void setName(String name);
}
