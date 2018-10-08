package com.xuhh.spring01.c_inject.c_factory;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:42 2018/10/7
 * @Modified By:
 */
public class UserServiceImpl  implements UserService {
	@Override
	public void add() {
		System.out.println(" c_factory add");
	}
}

