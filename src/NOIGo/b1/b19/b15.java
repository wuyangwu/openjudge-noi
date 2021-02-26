package NOIGo.b1.b19;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 20:36
 */
public class b15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] number = new int[n];
        int sum =0;
        for (int i = 0 ; i < n; i++)
            number[i] = scanner.nextInt();
        int k ;
        for (k = 0 ; k < n;k++){
            if (number[k]!=0){
                break;
            }
        }
        if (k == n){
            System.out.println(0);
            System.exit(0);
        }
        int i = 1;
        for (; i < 10000; i++){
            int j = 0;
            int count = 0;
            while (count!=m&&j<n){
                if (number[j]!=0){
                    count++;
                    number[j++] -= 1;
                }else {
                    j++;
                }
            }
            for (k = 0 ; k < n;k++){
                if (number[k]!=0){
                    break;
                }
            }
            if (k == n){
                break;
            }
        }
        System.out.println(i);
    }
}
