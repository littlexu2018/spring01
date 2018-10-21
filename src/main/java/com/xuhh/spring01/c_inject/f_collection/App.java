package com.xuhh.spring01.c_inject.f_collection;

import com.xuhh.spring01.c_inject.e_lifecyle.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        String xmlPath = "com/xuhh/spring01/c_inject/f_collection/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        CollDate collDate =applicationContext.getBean("collDate",CollDate.class);
        System.out.println(collDate);
    }
}
