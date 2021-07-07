package com.atguigu.factorymethod.PizzaStore.Pizza;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/30 17:38
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒");
        System.out.println("给北京胡椒披萨准备原材料");
    }
}
