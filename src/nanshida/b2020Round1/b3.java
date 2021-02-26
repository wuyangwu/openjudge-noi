package nanshida.b2020Round1;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/4 13:58
 */
public class b3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        for (int i = number.length()-1; i>=0;i--)
            System.out.print(number.charAt(i));
    }
}
