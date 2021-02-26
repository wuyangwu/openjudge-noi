package com.juc1205.day15;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 20:50
 *
 * 接口是抽象方法和常量值定义的集合
 * 1.我们使用interface关键字定义接口
 * 2.接口，是与类并列的一个结构
 * 3.接口种只能定义抽象方法和全局常量------jdk7及之前的版本
 *         抽象方法，声明为public abstract的
 *         全局常量：声明为public static final 的
 * 4.类与类之间可以体现；继承关系
 *   类与接口可以体现实现关系
 *   >当类实现了接口以后，就需要重写接口种的抽象方法，进而可以实例化此实现类；
 *   >如果类实现接口以后，并没有重写接口种的所有的抽象方法，此实现类就是抽象类，使用abstract修饰
 * 5. 类可以实现多个接口 一定程度上解决了类的单继承的局限性
 * 6. 接口与接口之间可以体现继承关系，可以多继承
 * 接口的本质是契约，标准，
 */
interface Flyable{
    public static final int MAX_SPEED = 7900;

    public static final int MIN_SPEED = 1;

    public abstract void fly();
}
interface Attackable{
    public abstract void attack();
}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机靠引擎飞行");
    }
}
class Bullet implements Flyable , Attackable{
    @Override
    public void fly() {
        System.out.println("飞机靠引擎飞行");
    }

    @Override
    public void attack() {
        System.out.println("子弹靠枪膛发射");
    }
}
//*************************************************************
interface a{
    //声明2个
    public abstract void a1();

    public abstract void a2();
}
interface b{
   // 声明3个
    public abstract void b1();
    public abstract void b2();
    public abstract void b3();
}
interface c extends a,b{

}
class d implements c{

    @Override
    public void a1() {

    }

    @Override
    public void a2() {

    }

    @Override
    public void b1() {

    }

    @Override
    public void b2() {

    }

    @Override
    public void b3() {

    }
}


public class interfaceTest  {

}
