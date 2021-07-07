package com.atguigu.factorymethod.PizzaStore.Pizza;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/30 17:37
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒");
        System.out.println("给伦敦胡椒披萨准备原材料");
    }
}
