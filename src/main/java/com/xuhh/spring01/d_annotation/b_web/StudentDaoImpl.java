package com.xuhh.spring01.d_annotation.b_web;

import org.springframework.stereotype.Repository;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 22:10 2018/10/22
 * @Modified By:
 */
@Repository("studentDaoId")
public class StudentDaoImpl implements StudentDao{
	@Override
	public void save() {
		System.out.println("dao");
	}
}
