package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/21 22:35
 */
public class b14 {
    public static void main(String [] args){
        int[] number= new int[40000];
        number[0] =1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i =2 ; i<=n ;i++){
            int count = 0;
            for (int j = 0 ; j <40000;j++ ){
                number[j] *= i;
                if(count!=0){
                    number[j] +=count;
                    count = 0;
                }
                if(number[j]>=10){
                    count = number[j]/10;
                    number[j] %= 10;

                }
            }
        }
        int s = 40000-1;
        while (number[s]==0){
            s--;
        };
        for (int i =s ; i>=0; i--){
            System.out.print(number[i]);
        }
    }
}
