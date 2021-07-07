package com.atguigu.segregation;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/18 16:34
 *
 * 接口隔离原则
 */
public class Segregration1 {
    public static void main(String[] args) {
        //A实现123
        A  a = new A();
        a.interface1(new B());
        a.interface2(new B());
        a.interface3(new B());
        // c实现145
        C c = new C();
        c.interface1(new D());
        c.interface4(new D());
        c.interface5(new D());
    }
}

interface interface1{
    void interface1();
    void interface2();
    void interface3();
    void interface4();
    void interface5();
    void interface6();
}

class A {
    public void interface1(interface1 interface1){
        interface1.interface1();
    }

    public void interface2(interface1 interface1){
        interface1.interface2();
    }

    public  void interface3(interface1 interface1){
        interface1.interface3();
    }

}

class C{
    public void interface1(interface1 interface1){
        interface1.interface1();
    }

    public void interface4(interface1 interface1){
        interface1.interface4();
    }
    public void interface5(interface1 interface1){
        interface1.interface5();
    }

}

class B implements  interface1{

    @Override
    public void interface1() {
        System.out.println("B 实现了接口1");
    }

    @Override
    public void interface2() {
        System.out.println("B 实现了接口2");
    }

    @Override
    public void interface3() {
        System.out.println("B 实现了接口3");
    }

    @Override
    public void interface4() {
        System.out.println("B 实现了接口4");
    }

    @Override
    public void interface5() {
        System.out.println("B 实现了接口5");
    }

    @Override
    public void interface6() {
        System.out.println("B 实现了接口6");
    }
}

class D implements  interface1{

    @Override
    public void interface1() {
        System.out.println("D 实现了接口1");
    }

    @Override
    public void interface2() {
        System.out.println("D 实现了接口2");
    }

    @Override
    public void interface3() {
        System.out.println("D 实现了接口3");
    }

    @Override
    public void interface4() {
        System.out.println("D 实现了接口4");
    }

    @Override
    public void interface5() {
        System.out.println("D 实现了接口5");
    }

    @Override
    public void interface6() {
        System.out.println("D 实现了接口6");
    }
}