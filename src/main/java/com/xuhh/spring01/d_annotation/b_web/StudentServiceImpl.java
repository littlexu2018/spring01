package com.xuhh.spring01.d_annotation.b_web;

import com.xuhh.spring01.d_annotation.b_web.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:53 2018/10/22
 * @Modified By:
 */
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	//这个是直接用set方法注入的，前面是用的私有变量注入的
//	@Autowired
//	@Qualifier("studentDaoId")
//	public void setStudentDao(StudentDao studentDao) {
//		this.studentDao = studentDao;
//	}

	@Override
	public void addStudent() {
		studentDao.save();
	}
}
