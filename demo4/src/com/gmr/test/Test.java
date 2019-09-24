package com.gmr.test;

import com.gmr.pojo.Dogs;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description 把bean配置从配置文件中搬出来，完全用注解实现
 * @Author GanMingRan
 * @Date 2019/9/24 10:49
 **/
public class Test {

    public static void main(String[] args){
        //加载applicationContext.xml配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        //获取springioc自动注入的bean对象
        Dogs dogs = (Dogs) context.getBean("dogs");
        dogs.setDogClass("大黄狗");
        dogs.getBlackDog().setDogAge("15");
        dogs.getBlackDog().setDogName("八公");
        System.out.println(dogs.getDogClass()+ "---" + dogs.getBlackDog().toString());
    }
}
