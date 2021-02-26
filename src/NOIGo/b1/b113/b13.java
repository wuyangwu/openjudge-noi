package NOIGo.b1.b113;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/7 22:29
 */
public class b13 {
    public static void main(String[] args){
        int b100 =0,b50=0,b20=0,b10 =0,b5=0,b1=0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number!=0){
            b100 += number/100;
            number %= 100;
            b50 += number/50;
            number%=50;
            b20 +=number/20;
            number %=20;
            b10 +=number/10;
            number %=10;
            b5 +=number/5;
            number %=5;
            b1 += number/1;
            number%=1;
        }
        System.out.println(b100);
        System.out.println(b50);
        System.out.println(b20);
        System.out.println(b10);
        System.out.println(b5);
        System.out.println(b1);
    }
}
