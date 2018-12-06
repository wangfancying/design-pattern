package com.hui.wang.design.pattern.clone;

import com.hui.wang.design.pattern.v2.ConcretePrototypeD;

import org.springframework.beans.BeanUtils;

/**
 * 目前流行的较为公用认可的工具类：
 *
 * Apache的两个版本：（反射机制）
 * org.apache.commons.beanutils.PropertyUtils.copyProperties(Object dest, Object orig)
 * org.apache.commons.beanutils.BeanUtils.copyProperties(Object dest, Object orig)
 *
 * Spring版本：（反射机制）
 * org.springframework.beans.BeanUtils.copyProperties(Object source, Object target, Class editable, String[] ignoreProperties)
 *
 * cglib版本：（使用动态代理，效率高）
 * net.sf.cglib.beans.BeanCopier.copy(Object paramObject1, Object paramObject2, Converter paramConverter)
 *
 * @author hui.wang09
 * @since 06 December 2018
 */
public class CloneUtileUse {

	public static void main(String[] args) {
		ConcretePrototypeD concretePrototypeD = new ConcretePrototypeD();
		concretePrototypeD.setName("this");

		ConcretePrototypeD newPrototype = new ConcretePrototypeD();
		BeanUtils.copyProperties(concretePrototypeD, newPrototype);

		System.out.println(concretePrototypeD);
		System.out.println(newPrototype);
	}
}
