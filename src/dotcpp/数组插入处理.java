package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 23:48 思路想用二分写
 */
public class 数组插入处理 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        for (int i = 0; i< 9;i++){
            number[i] = scanner.nextInt();
        }
        int m =scanner.nextInt();
        int i = 0;
        int j = 8;
        int center = 0;
        while (i<=j){
            center = i + (j-i)/2;
            if (m == number[center]){
                break;
            }
            if (m>number[center]){
                i= center+1;
            }else {
                j =center-1;
            }
        }
        if (m>=number[center]){
            center++;
        }

        for ( i = 8; i>=center;i--){
            number[i+1] =number[i];
        }
        number[center] = m;
        for (i =0;i<=9;i++ ){
            System.out.println(number[i]);
        }

    }
}
