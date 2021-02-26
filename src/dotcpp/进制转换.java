package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 19:12 编程，输入一个１０进制正整数，然后输出它所对应的八进制数。
 */
public class 进制转换 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] sum = new int[100000];
        int count =0;
        while (number!=0){
            sum[count++] = number%8;
            number /=8;
        }
        for (int i = count-1; i>=0; i--){
            System.out.print(sum[i]);
        }
    }
}
