package NOIGo.b1.b19;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 21:22  15题第二种写法
 */
public class b152 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] number = new int[n]; // 一共有多少人和需求多少水
        int[] tap = new int[m]; // 水龙头接水的人
        int time =0;
        int i = 0;
        for (i = 0 ; i < n; i++)
            number[i] = scanner.nextInt();
        for (i = 0; i < m; i++)
            tap[i] = number[i];
        while (i<n){
            int s = tap[0];
            for (int j = 0 ; j < m ; j++)
                s = Math.min(s,tap[j]);  // 找出最小的消费
            time +=s;
            for (int j = 0; j<m;j++){
                tap[j] -=s;
                if (tap[j] ==0)
                    tap[j] = number[i++]; // 换人
            }
        }
        int max = tap[0];
        for (i = 1 ; i< m ; i++){
            max = Math.max(max,tap[i]);
        }
        System.out.println(time+max);

    }
}
