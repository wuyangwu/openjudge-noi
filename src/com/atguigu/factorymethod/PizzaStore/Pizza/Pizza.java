package com.atguigu.factorymethod.PizzaStore.Pizza;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/30 17:31
 */
public abstract class Pizza {
    protected String name; // 名字

    //准备原材料，不同的披萨不一样。因此，我们做成抽象方法
    public abstract void prepare();

    public void bake(){
        System.out.println(name+"baking ");
    }

    public void cut(){
        System.out.println(name+"cutting ");
    }

    public void box(){
        System.out.println(name+"boxing ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
