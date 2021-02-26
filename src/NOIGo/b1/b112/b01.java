package NOIGo.b1.b112;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/29 15:28
 */
public class b01 {
    static int suanshu(int m , char fu , int n){
        switch (fu){
            case '+' : return m+n ;
            case '-' : return m-n;
            case '*' : return m*n;
            case '/' : return m/n;
            default: return m%n;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        char fu = scanner.next().charAt(0);
        int n = scanner.nextInt();
        System.out.println(suanshu(m,fu,n));
    }
}
