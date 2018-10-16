package com.xuhh.spring01.c_inject.e_lifecyle;

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
        String xmlPath = "com/xuhh/spring01/c_inject/e_lifecyle/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService =applicationContext.getBean("userService",UserService.class);
        userService.add();
        try {
            //这个就是关闭方法
            applicationContext.getClass().getMethod("close").invoke(applicationContext);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        //applicationContext.getClass().getInterfaces().
    }
}
