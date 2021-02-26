package com.juc1205.day15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 18:36
 *
 * 抽象性的应用，模板方法的设计模式
 *
 */

abstract class Template{
    // 己算某段代码的执行，需要花费的时间
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行code()花费的时间"+(end-start));
    }
    public abstract void code();
}

class SubTemplate extends Template{
    @Override
    public void code() {
        for (int i = 2;i<=100000000;i++){
            boolean flag = true;
            for (int j = 2; Math.sqrt(j)<=i;j++){
                if(i%j == 0){
                    flag =false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
public class TemplateTestAbstract {
    public static void main(String[] args) {
        Template template = new SubTemplate();
        template.spendTime();
    }
}
