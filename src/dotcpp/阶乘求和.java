package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/23 13:52
 */
public class 阶乘求和 {
    //递归求之
    static long digui(long m){
        if (m==1)
            return 1;
        return m*digui(m-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= n;i++){
            sum +=digui(i);
        }
        System.out.println(sum);
    }
}
