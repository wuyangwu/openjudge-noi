package com.atguigu.SimplyFactory;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/27 15:24
 *
 * j
 */
public class pizzastore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactoryPizza());
        System.out.println("退出了程序");
    }
}
// 将Pizza类做成抽象的
abstract class Pizza{
    protected String name; // 名字

    //准备原材料，不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name+"baking;");
    }

    public void  cut(){
        System.out.println(name+" cutting");
    }
    public void box(){
        System.out.println(name+ " boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class ChessPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备原材料");
    }
}

class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料");
    }
}

class OrderPizza{
    // 定义一个简单工厂的对象
    private  SimpleFactoryPizza simpleFactoryPizza;

    private Pizza pizza = null;

    public void setSimpleFactoryPizza(SimpleFactoryPizza simpleFactoryPizza){
        this.simpleFactoryPizza = simpleFactoryPizza;
        Scanner scanner = new Scanner(System.in);
        String orderType;
        do {
            orderType = scanner.nextLine();
            pizza = simpleFactoryPizza.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.box();
                pizza.cut();
            }else {
                System.out.println("    订购披萨失败！   ");
                break;
            }
        }while (true);
    }
    public OrderPizza(SimpleFactoryPizza simpleFactoryPizza){
        this.setSimpleFactoryPizza(simpleFactoryPizza);
    }
}
/// 简单工厂类
class SimpleFactoryPizza{
    public Pizza createPizza(String ordertype){
        Pizza pizza = null;
        if (ordertype.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else if(ordertype.equals("chess")){
            pizza = new ChessPizza();
            pizza.setName("chess");
        }
        return pizza;
    }
}