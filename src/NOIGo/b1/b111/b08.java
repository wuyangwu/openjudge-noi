package NOIGo.b1.b111;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/29 0:06
 */
public class b08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0 ; i<n;i++)
            number[i] = scanner.nextInt();
        Arrays.sort(number,0,n);
        for (int i = 0 ; i < n-1;i++){
            if (number[i]!=number[i+1]){
                System.out.print(number[i]+" ");
            }
        }
        System.out.print(number[n-1]);

    }
}
