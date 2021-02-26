package com.juc1205.day15;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 21:31
 */
class Computer{
    public void transferData(USB usb){ // 多态性将父类的引用指向子类的对象，将子类实现类的对象指向接口的引用
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}
interface USB{
    public abstract void start();
    public abstract void stop();
}

class Printer implements USB{

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}

class Flash implements USB{

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}

public class USBTestInterface {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.transferData(new Printer());
        computer.transferData(new Flash());
    }
}
