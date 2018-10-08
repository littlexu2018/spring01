package com.xuhh.spring01.b_di;

/**
 * @Author: xuhh
 * @Description:
 * @Date: Created in 19:34 2018/10/8
 * @Modified By:
 */
public class BookServiceImpl implements BookService {

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	private BookDao bookDao;
	@Override
	public void addBook(){
		bookDao.addBook();
	}
}
