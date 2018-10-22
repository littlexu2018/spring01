package com.xuhh.spring01.d_annotation.a_ioc;

import org.springframework.stereotype.Component;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:42 2018/10/7
 * @Modified By:
 */
@Component
public class UserServiceImpl  implements UserService {
	@Override
	public void add() {
		System.out.println("d_annotation.a.ioc add user");
	}
}

