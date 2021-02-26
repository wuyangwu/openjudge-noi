package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 23:03
 */
public class 陶陶摘苹果2 {
    public static void main(String[] argss){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = n;
        int m = scanner.nextInt()+30;
        int[] number = new int[n];
        for (int i = 0; i<n;i++)
            number[i] = scanner.nextInt();
        for (int i =0 ;i < n; i++){
            if (number[i]>m){
                count--;
            }
        }
        System.out.println(n-count);
    }
}
