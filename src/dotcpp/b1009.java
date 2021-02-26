package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 10:42
 */
public class b1009 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int[] numbers =new int[number.length()];
        for (int i =0; i<number.length();i++)
            numbers[i] = number.charAt(i);
        System.out.println(number.length());
        for (int i =0; i<number.length();i++)
            System.out.print(numbers[i]-'0'+" ");
        System.out.println();
        for (int i =0; i<number.length();i++)
            System.out.print(numbers[number.length()-i-1]-'0');
    }
}
