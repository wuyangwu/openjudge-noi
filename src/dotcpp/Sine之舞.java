package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 21:45
 */
public class Sine之舞 {
    static String an(int n,int k){
        if (n==1){
            return String.format("sin(%s)",k);
        }
       if (n%2==0){
           return String.format("sin(%s+%s)",k,an(n-1,k+1));
       }
       return String.format("sin(%s-%s)",k,an(n-1,k+1));
    }
    static String ans(int n,int k){
        if (n==1){
            return String.format("sin(%s)",k);
        }
        if (n%2==0){
            return String.format("sin(%s-%s)",k,ans(n-1,k+1));
        }
        return String.format("sin(%s+%s)",k,ans(n-1,k+1));
    }

    static String sn(int n, int k,int m){
        if (n==1){
            return String.format("%s+%s",an(n,k),m);
        }
        return String.format("(%s)%s+%s",sn(n-1,k,m+1),n%2!=0?an(n,k):ans(n,k),m);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sn(n,1,1));
//        System.out.println(ans(2,1));
    }
}
