package com.xuhh.spring01.b_di;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 19:30 2018/10/8
 * @Modified By:
 */
public class BookDaoImpl implements BookDao {

	@Override
	public void addBook(){
		System.out.println("di add book");
	}
}
