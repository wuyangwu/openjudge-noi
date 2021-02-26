package dotcpp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 0:41
 */
public class 打水问题 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] number = new int[n];
        for (int i =0 ; i< n; i++){
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number,0,n);
        int sum = 0;
        for (int i = m ; i< n; i++){
            sum += number[i-m];
            number[i] +=number[i-m];
        }
        System.out.println(sum);
    }
}
