package com.xuhh.spring01.d_annotation.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 21:39 2018/10/22
 * @Modified By:
 */
@Controller
public class StudentAction {

	@Autowired
	private StudentServiceImpl  studentService;

	public  void execute() {
		studentService.addStudent();
	}
}
