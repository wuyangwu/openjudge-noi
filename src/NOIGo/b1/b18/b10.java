package NOIGo.b1.b18;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/25 22:15
 */
public class b10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] number = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                number[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < m; j++){
                System.out.print(number[j][i]+" ");
            }
            System.out.println();
        }
    }
}
