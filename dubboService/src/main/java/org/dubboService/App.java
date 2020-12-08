package org.dubboService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ) throws  Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ((ClassPathXmlApplicationContext) context).start();
        System.out.println("dubbo service启动成功");
        System.in.read();
        System.out.println("dubbo service关闭");
    }
}
