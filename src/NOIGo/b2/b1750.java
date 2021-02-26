package NOIGo.b2;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/7 23:16
 */
public class b1750 {
    static int[] a= new int[6];// 标记数组
    static int[] b = new int[6]; // 存入值数组
    static int[] c = new int[6]; // 存入值数组

    static void dfs(int n, int length){
        if (n == length){
            for(int i = 0 ; i< length;i++)
                System.out.print((char)(c[i]));
            System.out.println();
            return;
        }

        for (int i = 0; i< length;i++){
            if (a[i]==0){
                a[i] = 1;
                c[n] = b[i];
                dfs(n+1,length);
                a[i] = 0;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String a = scanner.next();
        for (int i = 0 ;i<a.length();i++)
            b[i] = a.charAt(i);
        dfs(0,a.length());
    }
}
