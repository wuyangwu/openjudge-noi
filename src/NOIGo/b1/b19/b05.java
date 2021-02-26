package NOIGo.b1.b19;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 14:37
 */
public class b05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0 ; i < n; i++)
            number[i] = scanner.nextInt();
        int max = number[0], min = number[0];
        for (int i = 1; i<n;i++){
            if (number[i]>max)
                max = number[i];
            if (number[i]<min)
                min = number[i];
        }
        System.out.println(max-min);
    }
}
