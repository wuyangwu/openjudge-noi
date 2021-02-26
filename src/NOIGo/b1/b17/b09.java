package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/22 14:48
 */
public class b09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        for (int i = 0 ; i < number.length(); i++){
            if ((number.charAt(i)>=65&&number.charAt(i)<90)||(number.charAt(i)>=97&&number.charAt(i)<122)){
                System.out.print((char)(number.charAt(i)+1));
            }else {
             if (number.charAt(i)==90||number.charAt(i)==122){
                 System.out.print((char)(number.charAt(i)-25));
             }else {
                 System.out.print(number.charAt(i));
             }
            }
        }
    }
}
