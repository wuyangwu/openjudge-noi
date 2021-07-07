package com.atguigu.factorymethod.PizzaStore.Pizza;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/30 17:38
 */
public class BJChessePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪");
        System.out.println("给北京奶酪披萨准备原材料");
    }
}
