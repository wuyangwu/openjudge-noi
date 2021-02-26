package NOIGo.b2.b24;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0             题目：2011
 * @date 2020/2/15 17:03
 */
public class b2991 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();   // 2011的次方 后末尾 4位  以次方的500位一个循环也就是 2011的次方 %10000 == 1 必然有1
        for (int i = 0 ; i<n;i++){
            String  number = scanner.next();
            char[] numbers = number.toCharArray();
            // 先求出 对500的余数 , 这样除可以不考虑超过int整数位   分治思路
            int ans = 0;
            for (int j = 0 ; j< number.length(); j++){
                ans = ans*10 + numbers[j] - '0';
                ans %= 500;
            }
            // 一样的只要求出末尾4位 所以只需要末尾4位去乘以2011不用管前面的数   分治思路
            int sum = 1;
            for (int j = 1; j<= ans; j++){
                sum = sum*2011;
                sum%=10000;
            }
            System.out.println(sum);
        }
    }
}
