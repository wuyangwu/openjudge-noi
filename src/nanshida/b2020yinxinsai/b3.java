package nanshida.b2020yinxinsai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/23 14:41
 */
public class b3 {

    public static void main(String[] args){
        // 假设 1 为政治  2 为历史  3为综合 4位地理
        // 1 -> 2
        // 3 ->  4
        // 2 -> 1 or 2—>4
        // 4-> 2 oe 4 -> 3
        // 1-2-1-2-1
        // 1-2-1-2-4
        // 1-2-4
        // 1 1 2 3 5 8 13 21
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int a = 1;
        int b = 0;
        int sum = 1;
        for (int i = 3 ; i<=n ; i++){
            b =sum;
            sum = (sum+a)%7654321;
            a = b;
        }
        System.out.println(sum);
    }
}
