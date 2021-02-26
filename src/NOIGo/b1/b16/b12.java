package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/21 20:34
 */
public class b12 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] sum = new int[201];
        sum[1] = 2;
        int m = scanner.nextInt();
        for (int i = 2 ; i <=m ; i++){
            int count = 0;
            for (int j= 1 ; j<200; j++){
                sum[j] *= 2;
                if(count == 1){
                    count =0;
                    sum[j] += 1;
                }

                if(sum[j]>=10){
                    sum[j] %=10;
                    count =1;
//                    sum[j+1] *= 2;
//                    sum[j+1] += 1;
                }
            }
        }
        int s = 200;
        while (sum[s]==0){
            s--;
        }
        for (int i = s ; i>=1;i--){
            System.out.print(sum[i]);
        }
    }
}
