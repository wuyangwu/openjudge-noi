package com.atguigu.inversion.improve;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/22 22:42
 *
 * 依赖倒转原则
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new weixin());
        person.receive(new Email());
    }
}

// 定义接口
interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息： hello,world";
    }
}

class weixin implements IReceiver{

    @Override
    public String getInfo() {
        return "微信消息： hello ok";
    }
}

class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
