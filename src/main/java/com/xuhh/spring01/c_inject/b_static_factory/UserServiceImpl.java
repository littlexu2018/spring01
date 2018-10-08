package com.xuhh.spring01.c_inject.b_static_factory;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:42 2018/10/7
 * @Modified By:
 */
public class UserServiceImpl  implements UserService {
	@Override
	public void add() {
		System.out.println(" b_static_factory add");
	}
}

