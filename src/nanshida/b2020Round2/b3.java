package nanshida.b2020Round2;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 14:01
 */
public class b3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = 0;
        int[][] a = new int[n][n];
        for (int i = 0; i< n ;i++){
            int count = 0;
            for (int j = 0; j < n; j++){
                count++;
                a[i][j] = scanner.nextInt();
                if (a[i][j] == 0){
                    count--;
                    break;
                }
            }
            if (count >= k) {
                m++;
            }
        }
        System.out.println();
    }
}
