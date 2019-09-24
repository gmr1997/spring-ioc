package com.gmr.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description
 * @Author GanMingRan
 * @Date 2019/9/24 10:34
 **/
//Component告诉Spring这是bean
@Component("dogs")
public class Dogs {

    private String dogClass;

    //也可以把注解写在set()方法上
    //3种注解方式，都可以实现注入，常用Autowired自动注入
    //Resource要求配置文件中bean的id和这里定义的变量名一致
    //Resource(name = "blackDogs")中的name为配置文件中bean的id
    //@Autowired
    //@Resource
    @Autowired
    private BlackDog blackDog;

    public String getDogClass() {
        return dogClass;
    }

    public void setDogClass(String dogClass) {
        this.dogClass = dogClass;
    }

    public BlackDog getBlackDog() {
        return blackDog;
    }

    public void setBlackDog(BlackDog blackDog) {
        this.blackDog = blackDog;
    }
}
