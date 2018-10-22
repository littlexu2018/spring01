package com.xuhh.spring01.d_annotation.a_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String xmlPath = "com/xuhh/spring01/d_annotation/a_ioc/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService= (UserService)applicationContext.getBean("userServiceImpl");
        userService.add();
    }
}
