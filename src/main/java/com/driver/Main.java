package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly x = new RWOnly();
        x.setName("yes");
        System.out.println(x.getName());
        //java: name has private access in com.driver.RWOnly
    }
}