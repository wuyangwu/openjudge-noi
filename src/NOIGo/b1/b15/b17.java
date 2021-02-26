package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 21:56
 */
public class b17 {
   // 用递归会导致时间超时
    public static int digui(int n){
        if (n == 1)
            return 1;
        if (n==2)
            return 1;
        return digui(n-1)+digui(n-2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m= scanner.nextInt();
        int a=1,b=1,i,c=1;
        for(i=1;i<=m-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}
