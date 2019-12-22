package com.huawei.zhuru;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        HelloWord obj = (HelloWord) context.getBean("helloWorld");
        obj.setMessage("amen");
        obj.getMessage();
        context.registerShutdownHook();
    }
}