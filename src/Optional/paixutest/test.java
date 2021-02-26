package Optional.paixutest;

//再看一个试用comparable的例子：
/**
 * PriorityQueue是在Java SE 5.0中，引入了的Collection API，他与传统queue不同的是，PriorityQueue并非是FIFO的队列，PriorityQueue会对里面的元素按照优先级进行排序。他是如何按优先级排序的呢？
 *
 * PriorityQueue队列按照在构造时所指定的顺序对元素排序，既可以根据元素的自然顺序来指定排序（参阅 Comparable），也可以根据 Comparator来指定，这取决于使用哪种构造方法。优先级队列不允许 null 元素。依靠自然排序的优先级队列还不允许插入不可比较的对象（这样做可能导致 ClassCastException）。
 * PriorityQueue队列的头是按指定排序方式的最小元素。如果多个元素都是最小值，则头是其中一个元素——选择方法是任意的。
 * ————————————————
 */
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class test implements Comparable<test>{
    private String name;
    private int population;
    public test(String name, int population)
    {
        this.name = name;
        this.population = population;
    }
    public String getName()
    {
        return this.name;
    }

    public int getPopulation()
    {
        return this.population;
    }
    public String toString()
    {
        return getName() + " " + getPopulation();
    }
    @Override
    public int compareTo(test o1) {
        return this.population-o1.population;
    }

    public static void main(String args[])
    {

        Queue<test> priorityQueue =  new PriorityQueue<test>();
        test t1 = new test("t1",10);
        test t3 = new test("t3",3);
        test t2 = new test("t2",2);
        test t4 = new test("t4",0);
        priorityQueue.add(t1);
        priorityQueue.add(t3);
        priorityQueue.add(t2);
        priorityQueue.add(t4);
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().toString());
        }
    }
}