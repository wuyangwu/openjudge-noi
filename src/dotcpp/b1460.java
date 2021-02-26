package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 14:45 问题 1460: [蓝桥杯][基础练习VIP]2n皇后问题
 */
public class b1460 {
    static int[][] qipan = new int[8][8];
    static int[] answerw = new int[8]; // 白皇后
//    static int[] answerb = new int[8]; // 黑皇后
    static int n = 0; // 几个
    static int sum = 0; // 数量

    static void dfs(int m ,int s){
        if (m == n){
            // 说明已经找到皇后
            if (s==1)
                dfs(0,2);
            else sum++;
            return;
        }
        // 第几列 m代表行数
        for (int i = 0; i< n ;i++){
            int j = 0;
            if (qipan[m][i] != 1)
                continue;
            for ( ; j < m; j++){
                if (Math.abs(answerw[j]-i) == Math.abs(m-j)||answerw[j]==i){
                    break;
                }
            }

            if (j==m){
                qipan[m][i] = 0;
                answerw[m]=i;
                dfs(m+1,s);
                qipan[m][i] = 1;

            }
        }
        return;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
        for (int i = 0 ; i< n ;i++){
            for (int j = 0; j <n; j++){
                qipan[i][j] = scanner.nextInt();
            }
        }
        dfs(0,1);
        System.out.println(sum);
    }
}
