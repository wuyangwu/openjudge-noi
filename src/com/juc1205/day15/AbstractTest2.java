package com.juc1205.day15;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 19:08
 */

abstract class Employee{
    private String name;
    private int id;
    private int salary;

    public Employee(){

    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public abstract void work();
}
class Mannager extends Employee{

    private double bonus; // 奖金

    public Mannager(){
    }

    public Mannager(String name, int id, int salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理者负责管理公司的运营");
    }
}
class CommonEmployee extends Employee{

    @Override
    public void work() {

    }
}

public class AbstractTest2 {
}
