package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 17:04 找最长升序子序
 */
public class 聪明的美食家 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] f = new int[n];
        int[] g = new int[n];
        int maxn = 1;
        for ( int i = 0; i< n ;i ++){
            f[i] = scanner.nextInt();
            g[i] = 1;
        }
        for (int i = 0; i< n;i++){
            int  j = 0;
            for (; j<i;j++){
                if (f[i]>=f[j]){
                    g[i] = Math.max(g[j]+1,g[i]);
                }
            }
            maxn = Math.max(maxn,g[i]);
        }
        System.out.println(maxn);
    }
}
