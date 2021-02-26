package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 10:50
 */
public class b1011 {
    // 辗转想除 求最大公约数
    static int bignumber(int n, int m){
        if (n%m==0)
            return m;
        return bignumber(m,n%m);
    }
    // 最小公倍数
    static int smallnumber(int n,int m){
        // 保证 n是最大的
        if (m>n){
            int c =m;
            m =n;
            n=c;
        }
        int i = n;
        for (;i<m*n;i++){
            if (i%n==0&&i%m==0){
                return i;
            }
        }
        return i;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(bignumber(n,m)+" "+smallnumber(n,m));
    }
}
