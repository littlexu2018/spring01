package com.xuhh.spring01.c_inject.b_static_factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
           // UserService userService =MyStaticBeanFactory.createUserService();
           // userService.add();
        String xmlPath = "com/xuhh/spring01/c_inject/b_static_factory/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService =(UserService)applicationContext.getBean("userService");
        userService.add();
    }
}
