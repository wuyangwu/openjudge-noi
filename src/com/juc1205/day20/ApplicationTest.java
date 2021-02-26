package com.juc1205.day20;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 10:03
 */
// 懒汉式
class Application{
    // 私有化构造函数
    private Application(){

    }

    private static Application app = null;
    // 3、通过方法获取当前类的实例
    public static Application getInstance(){
       synchronized (Application.class){
           if(app == null){
               app = new Application();
           }
       }
        return app;
    }

}

public class ApplicationTest {
    public static void main(String[] args) {
       Application application =  Application.getInstance();

    }
}
