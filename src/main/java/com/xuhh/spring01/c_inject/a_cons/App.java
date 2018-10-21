package com.xuhh.spring01.c_inject.a_cons;

import com.xuhh.spring01.c_inject.b_static_factory.UserService;
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
        String xmlPath = "com/xuhh/spring01/c_inject/a_cons/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        User user =(User) applicationContext.getBean("user");
        System.out.println(user);
    }
}
