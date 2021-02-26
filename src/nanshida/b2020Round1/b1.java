package nanshida.b2020Round1;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/4 13:32
 */
public class b1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int num = number;
        int[] numbers = new int[100];
        int count = 0;
        while (number!=0){
            numbers[count++] = number%10;
            number/=10;
        }
        for (int i = count-2 ; i>=0; i-- ){
            System.out.print(numbers[i]);
        }
        if (num == 0)
            System.out.print(number);
        else System.out.print(numbers[count-1]);
    }
}
