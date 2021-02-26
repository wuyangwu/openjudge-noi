package nanshida.b2020yinxinsai;

import java.util.Scanner;

/**
 * @author wuyang 参考
 * @version 1.0
 * @date 2020/1/23 17:50
 */

public class b41 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[] k = new int[10000];
        int[] m = new int[10000];
        int[] dp = new int[10000];
        for (int i = 0 ; i < n; i++){
            k[i] = scanner.nextInt();
            m[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
//               for(int j=c;j>=m[i];j--){
//                 dp[j]=Math.max(dp[j],dp[j-m[i]]+k[i]);
//                   System.out.println(dp[j]);
//            }
            for(int j = 0 ; j <=c; j++){
                if(j>=m[i]){
                    dp[j]=Math.max(dp[j],dp[j-m[i]]+k[i]);
                    System.out.println(dp[j]);
                }
            }
        }
        for(int i=0;i<=c;i++){
            if(dp[i]>=v) {
                System.out.println(c-i);
                System.exit(0);
            }
        }
        System.out.println("Impossible");
    }
}
