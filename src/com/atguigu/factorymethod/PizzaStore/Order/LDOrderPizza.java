package com.atguigu.factorymethod.PizzaStore.Order;

import com.atguigu.factorymethod.PizzaStore.Pizza.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/30 18:24
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("chesse")){
            pizza = new LDChessePizza();
        }else {
            pizza =  new LDPepperPizza();
        }
        return pizza;
    }
}
