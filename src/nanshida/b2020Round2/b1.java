package nanshida.b2020Round2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 13:34
 */
public class b1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i< n ; i++){
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number,0,n);

        int a = n/2;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += Math.abs(number[a]-number[i]);
        }
        System.out.println(sum);
    }
}
