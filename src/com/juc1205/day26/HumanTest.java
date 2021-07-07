package com.juc1205.day26;

import com.sun.security.ntlm.Server;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/4/6 14:24
 *
 * 反射的应用：动态代理
 *
 */

interface Human{
    String getBelief();

    void eat(String food);
}

// 被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {

        return "I believe I can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃："+food);
    }
}
/*
*
*  根据提供的接口和其被代理类，动态的创建代理类，并调用相关的方法完成功能
*
*  问题一：如何根据加载到内存中的被代理类的对象，动态的创建代理类的对象
*
*  问题二：如何实现通过代理类的对象调用接口声明的方法时，动态的实现对被代理类同名的方法的调用
*
*
* */

class MyProxy{
    // 问题一：如何根据加载到内存中的被代理类的对象，动态的创建代理类的对象
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
        MyInvocationHander myInvocationHander = new MyInvocationHander(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),myInvocationHander);
    }
}
//问题二：如何实现通过代理类的对象调用接口声明的方法时，动态的实现对被代理类同名的方法的调用
class  MyInvocationHander implements InvocationHandler{

    private  Object obj; // 被代理类的对象

    public MyInvocationHander(Object obj){
        this.obj = obj;
    }
    // 当我们通过代理类的对象，调用接口中的声明额方法时，会自动调用如下的invoke
    // 我们只需要将被代理类对象的同名方法在此invoke中执行即可
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       Object returnVal = method.invoke(obj,args);
        return returnVal;
    }
}
public class HumanTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan(); // 被代理类的对象
        Human human =  (Human) MyProxy.getProxyInstance(superMan);
        human.eat("西红柿炒鸡蛋"); // 通过代理类调用接口中声明的方法------>对代理类同名同参数的
        System.out.println( human.getBelief());

        //*****************************************************

    }
}
