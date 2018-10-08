package com.xuhh.spring01.b_di;

import com.xuhh.spring01.a_ioc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookServiceId= (BookService)applicationContext.getBean("bookServiceId");
        bookServiceId.addBook();
    }
}
