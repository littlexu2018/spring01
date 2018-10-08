package com.xuhh.spring01.c_inject.c_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String xmlPath = "com/xuhh/spring01/c_inject/c_factory/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService =applicationContext.getBean("userService",UserService.class);
        userService.add();
    }
}
