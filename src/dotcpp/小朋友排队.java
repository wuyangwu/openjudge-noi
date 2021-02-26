package dotcpp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 16:10  快速排序
 */
class Person{
    int height = 0;
    int count = 0;
    Person(int height, int count){
        this.height = height; // 身高
        this.count = count;   // 疲劳度
    }
}
public class 小朋友排队 {

    static void merge(int x, int mind,int y,Person person[],Person peoples[]){
        // x-mind 是左边，mind+1-y是右边，并且左右边都是排序好的
        int j = x,j1 = mind+1,k=x;
        while (j<=mind&&j1<=y){
            // 右边的数比左边的大，则把小的数塞入
            if (person[j].height<=person[j1].height){
                person[j].count += j1-mind+1;
                peoples[k++] = person[j++];
            }else {
                // 左边的数比右边的数字大
                person[j1].count += mind-j+1;
                peoples[k++] = person[j1++];
            }


            while (j1<=y){
                peoples[k++] = person[j1++];
            }
             j1--;
            // 总有一个数没有塞入完
            while (j<=mind){
                person[j].count += j1-mind;
                peoples[k++] = person[j++];
            }
            for (int i = 0; i<=y;i++)
                person[i] = peoples[i];
        }

    }

    static void mergesort(int x , int y,Person person[],Person peoples[]){
        if (x<y){
            int mind = x+(y-x)/2;
            mergesort(x,mind,person,peoples);
            mergesort(mind+1,y,person,peoples);
            merge(x,mind,y,person,peoples);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Person[] people = new Person[n];
        Person[] peoples = new Person[n];
        for (int i = 0 ; i<n;i++){
            people[i] = new Person(scanner.nextInt(),0);
        }
        mergesort(0,n-1,people,peoples);
        long sum = 0L;
        for (int i =0 ; i< n;i++){
            sum += ((people[i].count+1)*people[i].count)/2;
        }
        System.out.println(sum);
    }
}
