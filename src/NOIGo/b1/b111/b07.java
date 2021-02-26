package NOIGo.b1.b111;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/28 23:33
 */
public class b07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0 ;i < n ; i++){
            number[i] = scanner.nextInt();
        }
        if (n==1){
            System.out.println("No");
            System.exit(0);
        }
        int m = scanner.nextInt();
        Arrays.sort(number,0,n);
        for (int i = 0 ; i < n-1 ; i++){
            int j = i+1;
            int jlength = n-1;
            int center = 0;
            while (j<=jlength){
                center = j + (jlength-j)/2;
                if (number[i]+number[center]==m){
                    System.out.println(number[i]+" "+number[center]);
                    System.exit(0);
                }
                if (m-number[i]>number[center]){
                    j = center+1;
                }else {
                    jlength = center-1;
                }
            }
        }
        System.out.println("No");
    }
}
