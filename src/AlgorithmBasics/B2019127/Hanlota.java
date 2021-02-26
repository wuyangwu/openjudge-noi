package AlgorithmBasics.B2019127;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/7 15:20  汉诺塔问题 递归
 */
public class Hanlota {
    public static void hanlotas(String a, String b , String c, int n){
        if(n ==1){
            System.out.println(a+"===>"+c);
            return;
        }
        hanlotas(a,c,b,n-1);
        System.out.println(a+"===>"+c);
        hanlotas(b,a,c,n-1);
    }

    public static void  main(String[] args){

        Scanner scanner = new Scanner(System.in);
        hanlotas("a","b","c",scanner.nextInt());
    }
}
