package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/21 23:05
 */
public class b15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]  number = new int[100];
        number[0]=1;
        int[] sum = new int[100];
        sum[0] =1;
        for (int k = 2 ; k <= n; k++) {
            for (int i = 2; i <= k; i++) {
                int count = 0;
                for (int j = 0; j < 100; j++) {
                    number[j] *= i;
                    if (count != 0) {
                        number[j] += count;
                        count = 0;
                    }
                    if (number[j] >= 10) {
                        count = number[j] / 10;
                        number[j] %= 10;

                    }
                }
            }
            for (int i = 0 ; i <100; i++){
                sum[i] += number[i];
                if(sum[i]>=10){
                    sum[i] -=10;
                    sum[i+1] +=1;
                }
            }
            int s = 100-1;
            while (number[s]==0){
                s--;
            };
            for (int i =s ; i>=0; i--){
                number[i]=0;
            }
            number[0]=1;
        }
        int s = 100-1;
        while (sum[s]==0){
            s--;
        };
        for (int i =s ; i>=0; i--){
            System.out.print(sum[i]);
        }

    }
}
