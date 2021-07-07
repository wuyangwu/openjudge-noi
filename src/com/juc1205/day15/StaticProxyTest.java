package com.juc1205.day15;

import sun.nio.ch.Net;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 22:06
 *
 * 接口的应用，代理模式
 * 代理模式是java开发中使用较多的设计模式。代理设计就是为其他对象提供一种代理以控制对这个对象的访问
 * 由代理类决定是否需要创建被代理类的对象，以及何时调用被代理类中的方法
 */
interface NetWork{
    public abstract void browse();
}
// 被代理类
class server implements NetWork{

    @Override
    public void browse() {
        System.out.println("服务器实现联网的操作");
    }
}
// 代理类
class ProxyServer implements NetWork{

    private NetWork netWork; //使用被代理类对象进行实列话

    public ProxyServer(NetWork netWork){
        this.netWork = netWork;
    }

    public void check(){
        System.out.println("联网操作前，进行网路设备的检查");
    }

    @Override
    public void browse() {
        this.check();
        netWork.browse();
    }
}
public class StaticProxyTest {
    public static void main(String[] args) {
        new ProxyServer(new server()).browse();
    }
}
