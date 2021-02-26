package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 19:34
 */
public class 用筛法求之N内的素数 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n*n+100];
        for (int i =2 ;i <=n;i++){
            for (int j = 2; j <=n;j++)
                number[i*j] =1;
        }
        for (int i =2 ; i<=n;i++){
            if (number[i]== 0){
                System.out.println(i);
            }
        }
    }
}
