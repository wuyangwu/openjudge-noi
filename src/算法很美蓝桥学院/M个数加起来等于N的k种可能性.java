package 算法很美蓝桥学院;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/24 9:12
 * M个数加起来等于N的k种可能性
 *  4  4
 *  1 1 2 2
 *  3
 *
 *  用dp的思路
 *
 */
public class M个数加起来等于N的k种可能性 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] k = new int[m+1][n+1];
        int[][] answer = new int[m+1][n+1];
        k[0][0] = 1;
        int x =0;
        for (int i = 1; i<=m;i++){
            x = scanner.nextInt();
            for (int j =0; j<=n;j++){
                k[i][j] += k[i-1][j];
                if (x<=j){
                    if(k[i-1][j-x] >=1){
                        answer[i][j] = 1;
                    }
                    k[i][j] += k[i-1][j-x];
                }

            }
        }

        System.out.println(k[m][n]);
    }
}
