package NOIGo.b2.b25;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0 放苹果
 * @date 2020/2/11 22:13
 */
public class b666 {
    // n是苹果 m是盘子
    static int find(int n ,int m){
        if (n<m)
            return find(n,n);
        if (n==0)
            return 1;
        if (n==1||m==1){
            return 1;
        }
        return find(n,m-1)+find(n-m,m);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(find(m,n));
    }
}
