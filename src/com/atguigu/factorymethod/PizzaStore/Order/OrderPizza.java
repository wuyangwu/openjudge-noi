package com.atguigu.factorymethod.PizzaStore.Order;

import com.atguigu.factorymethod.PizzaStore.Pizza.Pizza;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/30 17:47
 */
public abstract class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        do{
            String orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.box();
            pizza.cut();
        }while (true);
    }

    public abstract Pizza createPizza(String orderType);

    String getType(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
