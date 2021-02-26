package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 19:54
 */
public class 陶陶摘苹果 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = 10;
        int[] number = new int[10];
        for (int i = 0; i< 10; i++){
            number[i] = scanner.nextInt();
        }
        int n = scanner.nextInt()+30;
        for (int i = 0; i< 10;i++){
            if (number[i]>n){
                m--;
            }
        }
        System.out.println(m);
    }
}
