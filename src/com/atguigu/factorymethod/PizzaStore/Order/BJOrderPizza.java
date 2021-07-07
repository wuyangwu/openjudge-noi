package com.atguigu.factorymethod.PizzaStore.Order;

import com.atguigu.factorymethod.PizzaStore.Pizza.BJChessePizza;
import com.atguigu.factorymethod.PizzaStore.Pizza.BJPepperPizza;
import com.atguigu.factorymethod.PizzaStore.Pizza.Pizza;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/30 18:00
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("chesse")){
            pizza = new BJChessePizza();
        }else {
            pizza =  new BJPepperPizza();
        }
        return pizza;
    }
}
