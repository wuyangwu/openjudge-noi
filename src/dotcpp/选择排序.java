package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 18:59
 */
public class 选择排序 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        for (int i =0 ; i <10; i++)
            number[i] = scanner.nextInt();
        for (int i = 0; i<10;i++){
            for (int j = i+1; j<10;j++){
                if (number[i]>number[j]){
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        for (int i =0 ; i <10; i++)
            System.out.println(number[i]);
    }
}
