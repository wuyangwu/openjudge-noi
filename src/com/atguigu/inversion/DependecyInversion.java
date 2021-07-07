package com.atguigu.inversion;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/20 21:24
 *
 * 依赖注入
 */
public class DependecyInversion {
    public static void main(String[] args) {

    }
}
class Email{
    public String getInfo(){
        return "电子信息:Hello,world";
    }
}

class Person{
    public void receive(Email email){

    }
}