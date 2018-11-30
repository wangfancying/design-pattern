package com.hui.wang.design.pattern.v3;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 *
 * @author hui.wang09
 * @since 30 November 2018
 */
public class TankProxy implements MethodInterceptor{

	private Object target;

	public TankProxy(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		//1.工具类
		Enhancer enhancer = new Enhancer();
		//2.设置父类
		enhancer.setSuperclass(target.getClass());
		//3.设置回调函数
		enhancer.setCallback(this);
		//4.创建子类(代理对象)
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("cglib proxy start.......");
		//执行目标对象的方法
		Object value = method.invoke(target, objects);
		System.out.println("cglib proxy end.......");
		return value;
	}
}
