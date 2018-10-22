package com.xuhh.spring01.d_annotation.b_web;

import com.xuhh.spring01.d_annotation.a_ioc.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String xmlPath = "com/xuhh/spring01/d_annotation/b_web/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        StudentAction studentAction= (StudentAction)applicationContext.getBean("studentAction");
        studentAction.execute();
    }
}
