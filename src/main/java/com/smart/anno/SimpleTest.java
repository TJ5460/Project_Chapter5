package com.smart.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleTest {
    public static void main(String[] args) {
        ApplicationContext  ctx = new ClassPathXmlApplicationContext("com/smart/anno/beans.xml");
        ((ClassPathXmlApplicationContext)ctx).destroy();
    }

}

