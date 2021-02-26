package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 19:55
 */
public class 蛇行矩阵 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] number = new int[n+1][n+1];
        for (int i = 0; i<=n; i++){
            for (int j = 1 ; j<=n; j++){
                if (i==0){
                    number[i][j] = number[i][j-1]+j;
                }else {
                    number[i][j] = number[i-1][j]+i+j-1;
                }
            }
        }
        int m = n;
        for (int i = 0; i <n;i++){
            for (int j = 1; j<=m; j++){
                System.out.print(number[i][j]+" ");
            }
            m--;
            System.out.println();
        }
    }
}
