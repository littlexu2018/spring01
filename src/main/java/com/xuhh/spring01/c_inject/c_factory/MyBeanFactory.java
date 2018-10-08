package com.xuhh.spring01.c_inject.c_factory;

/**
 * @Author: xuhh
 * @Description:实例工厂
 * @Date: Created in 0:35 2018/10/9
 * @Modified By:
 */
public class MyBeanFactory {

	public  UserService createUserService(){
		return new UserServiceImpl();
	}
}
