package com.atguigu.principle;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/11 15:46
 *
 * 单一职责原则
 */

//交通工具
// 方式1

class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行。。。。。。");
    }
}

public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");

    }
}
