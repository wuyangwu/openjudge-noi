package NOIGo.b2.b25;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/9 21:47 棋盘问题
 */
public class b323 {
    static String[] qipan = new String[10]; // 棋盘样子
    static int[][] biaoshi = new int[10][10]; // 棋盘标识
    static int count = 0;
    static int n = 0;
    static void dfs(int m , int k){
        if (m==k){
            count++;
            return;
        }
        for (int i = m; i < n; i++){
            for (int j =0; j < n; j++){
                if (biaoshi[i][j] == 0&&qipan[i].charAt(j) == '#'){
                    biaoshi[i][j] = 1;
                    dfs(m+1,k);
                    biaoshi[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = 0;
        while ((n = scanner.nextInt())!=-1&&(k = scanner.nextInt())!=-1){
            for (int i = 0 ; i<n; i++)
                qipan[i] = scanner.next();
            dfs(0,k);
            System.out.println(new BigDecimal(count).toString());
            qipan = new String[10]; // 棋盘样子
            biaoshi = new int[10][10]; // 棋盘标识
            count = 0;
        }

    }
}
