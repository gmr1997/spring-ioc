package com.gmr.pojo;

/**
 * @Description
 * @Author GanMingRan
 * @Date 2019/9/24 11:04
 **/
public class BlackDog {
    private String dogName;
    private String dogAge;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogAge() {
        return dogAge;
    }

    public void setDogAge(String dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "BlackDog{" +
                "dogName='" + dogName + '\'' +
                ", dogAge='" + dogAge + '\'' +
                '}';
    }
}
