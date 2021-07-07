package com.atguigu.segregation;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/20 21:04
 */
public class Segregration2 {

    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.interface1(new D2());
        a2.interface4(new D2());
        a2.interface5(new D2());


        C2 c2 = new C2();
        c2.interface1(new B2());
        c2.interface2(new B2());
        c2.interface3(new B2());
    }
}


interface interface2{
    public void interface1();
}

interface interface3{
    public void interface2();

    public void interface3();
}

interface interface4{
    public void interface4();
    public void interface5();
}

class A2{
    public void interface1(interface2 interface3){
        interface3.interface1();
    }

    public void interface4(interface4 interface4){
        interface4.interface4();
    }

    public void interface5(interface4 interface4){
        interface4.interface5();
    }

}

class C2 {
    public void interface1(interface2 interface2){
        interface2.interface1();
    }

    public void interface2(interface3 interface3){
        interface3.interface2();
    }

    public void interface3(interface3 interface3){
        interface3.interface3();
    }
}


class D2 implements  interface2, interface4{

    @Override
    public void interface1() {
        System.out.println("D2 实现了接口1");
    }

    @Override
    public void interface4() {
        System.out.println("D2 实现了接口4");
    }

    @Override
    public void interface5() {
        System.out.println("D2 实现了接口5");
    }
}

class B2 implements interface2 ,interface3{

    @Override
    public void interface1() {
        System.out.println("B2 实现了接口1");
    }

    @Override
    public void interface2() {
        System.out.println("B2 实现了接口2");
    }

    @Override
    public void interface3() {
        System.out.println("B2 实现了接口3");
    }
}


