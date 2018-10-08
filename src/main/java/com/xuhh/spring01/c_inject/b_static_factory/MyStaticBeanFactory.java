package com.xuhh.spring01.c_inject.b_static_factory;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 0:35 2018/10/9
 * @Modified By:
 */
public class MyStaticBeanFactory {

	public static UserService    createUserService(){
		return new  UserServiceImpl();
	}
}
