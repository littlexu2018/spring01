package com.xuhh.spring01.c_inject.e_lifecyle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 15:08 2018/10/15
 * @Modified By:
 */
public class MybeanPostProcessor  implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("前方法" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization( final Object bean, String beanName) throws BeansException {
		System.out.println("后方法" + beanName);
		return Proxy.newProxyInstance(MybeanPostProcessor.class.getClassLoader(), bean.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("-------------开启事务");
						Object obj=method.invoke(bean,args);
						System.out.println("--------------关闭事务");

						return obj;
					}
				});
	}
}
