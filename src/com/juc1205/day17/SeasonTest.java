package com.juc1205.day17;

import java.util.Collections;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/26 21:33
 *
 * 一、枚举类
 *
 * 二、定义枚举类
 *      方法一、定义的方式
 *      方式二、使用enum关键字定义
 * 三、枚举类的常用方法
 *     > values()；获取当前枚举类所有对象
 *     >
 *
 * 四、枚举类实现接口
 *      枚举类的每一个对象都分别实现接口中的抽象方法
 *
 */
// 自定义枚举类
class Season implements Info{

     private final String seasonName; //季节的名字

    private final String seasonDesc;// 季节的描述

    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public void shows(){

    }

    // 创建类的对象
    public static final Season SPRING = new Season("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天花会开");
        }
        @Override
        public void shows(){

        }
    };
    public static final Season SUMMER = new Season("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天夏天悄悄过去，留下小秘密");
        }
    };
    public static final Season AUTUMN = new Season("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天是用来分手的季节");
        }
    };
    public static final Season WINTER = new Season("冬天","白雪皑皑");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("空");
    }
}

interface Info{
    void show();
}

enum Season1 implements Info{
    SPRING("春天","出暖花开"){
        @Override
        public void show() {
            System.out.println("春天花会开");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天夏天悄悄过去，留下小秘密");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天是用来分手的季节");
        }
    },
    WINTER("冬天","白雪皑皑"){
        @Override
        public void show() {
            System.out.println("冬天是一个好日子");
        }
    };

    private final String SEASON_NAME; //季节名字
    private final String SEASON_DESC; // 季节的描述


    private Season1(String SEASON_NAME, String SEASON_DESC) {
        this.SEASON_NAME = SEASON_NAME;
        this.SEASON_DESC = SEASON_DESC;
    }


    public String getSeasonName() {
        return SEASON_NAME;
    }

    public String getSeasonDesc() {
        return SEASON_DESC;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + SEASON_NAME + '\'' +
                ", seasonDesc='" + SEASON_DESC + '\'' +
                '}';
    }

}

public class SeasonTest {
    public static void main(String[] args) {
        Season.WINTER.show();
       /* System.out.println(Season.AUTUMN);
        System.out.println( Season.AUTUMN.getSeasonName());*/
        System.out.println(Season1.AUTUMN);
        System.out.println(Season1.AUTUMN.getSeasonName());
       Season1.AUTUMN.show();
    }
}
