package bailian;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 21:37  电影节 贪心算法
 */
class Dianyin implements Comparable<Dianyin>{
    int x;
    int y;
    public Dianyin(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Dianyin o) {
        return this.y-o.y;
    }
}
public class b4151 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =0 ;
        while ((n = scanner.nextInt())!=0){
            Dianyin[] number = new Dianyin[n];
            for (int i=0; i<n;i++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                number[i] = new Dianyin(x,y);
            }
            Arrays.sort(number,0,n);
            int sum = 0,y=0;
            for (int i =0 ; i <n; i++){
                // 开始时间大于等于结束时间
                if (number[i].x>=y){
                    sum++;
                    y = number[i].y;
                }
            }
            System.out.println(sum);
        }
    }
}
