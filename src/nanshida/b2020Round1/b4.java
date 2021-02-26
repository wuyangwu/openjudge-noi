package nanshida.b2020Round1;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/4 14:01
 */
public class b4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        char c = scanner.next().charAt(0);
        number = number.replaceAll(String.valueOf(c),"");
        System.out.println(number);
    }
}
