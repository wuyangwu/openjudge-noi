package NOIGo.b2.b22;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/15 15:44 放苹果
 */
public class b666 {
    // m 为苹果 n为盘子
    static int digui(int m, int n){
        // 如果盘子的数量大于苹果 则多余的盘子视为同一种摆放
        if (n>m)
            return digui(m,m);
        if (n==0)
            return 1;
        if (n==1||m==1)
            return 1;
        return digui(m,n-1)+digui(m-n,n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i<t;i++){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println(digui(m,n));
        }
    }
}
