package com.xuhh.spring01.c_inject.e_lifecyle;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:42 2018/10/7
 * @Modified By:
 */
public class UserServiceImpl  implements UserService {
	@Override
	public void add() {
		System.out.println(" c_inject.e_lifecyle add");
	}

	public void myInit(){
		System.out.println("初始化方法");
	}

	public void myDestory(){
		System.out.println("销毁方法");
	}
}

