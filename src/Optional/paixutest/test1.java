package Optional.paixutest;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 23:15
 */

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class test1 {
    private String name;
    private int population;

    public test1(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public int getPopulation() {
        return this.population;
    }
    @Override
    public String toString() {
        return getName() + " - " + getPopulation();
    }

    public static void main(String args[]) {
        Comparator<test1> OrderIsdn = new Comparator<test1>() {
            @Override
            public int compare(test1 o1, test1 o2) {
                // TODO Auto-generated method stub
                int numbera = o1.getPopulation();
                int numberb = o2.getPopulation();
                if (numberb > numbera) {
                    return 1;
                } else if (numberb < numbera) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };
        Queue<test1> priorityQueue = new PriorityQueue<test1>(11, OrderIsdn);
        test1 t1 = new test1("t1", 1);
        test1 t3 = new test1("t3", 3);
        test1 t2 = new test1("t2", 2);
        test1 t4 = new test1("t4", 0);
        priorityQueue.add(t1);
        priorityQueue.add(t3);
        priorityQueue.add(t2);
        priorityQueue.add(t4);
        System.out.println(priorityQueue.poll().toString());
    }

}