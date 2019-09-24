package com.gmr.test;

import com.gmr.pojo.Dogs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 注入对象示例
 * @Author GanMingRan
 * @Date 2019/9/24 10:49
 **/
public class Test {

    public static void main(String[] args){
        //加载applicationContext.xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        //获取springioc自动注入的bean对象
        Dogs dogs = (Dogs) context.getBean("dogs");
        System.out.println(dogs.toString());
    }
}
