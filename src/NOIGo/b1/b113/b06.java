package NOIGo.b1.b113;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/6 20:03
 */
public class b06 {
    static String numberstr;
    static boolean find(int[] number){
        int length = number.length;
//        if (number[number.length-1] == 0)
//            length  = length -1;
        for (int i = 0 ; i<length;i++){
        if (numberstr.indexOf(String.valueOf(number[i]))==-1){
            return false;
        }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         numberstr = scanner.next();
        int[] number = new int[numberstr.length()];
        int[] newnumber = new int[numberstr.length()];
         for (int i = 0 ; i<numberstr.length(); i++){
             number[i] = numberstr.charAt(numberstr.length()-i-1)-'0';
             newnumber[i] = numberstr.charAt(numberstr.length()-i-1)-'0';
         }

         for (int j = 1; j <=numberstr.length(); j++ ){
             int count = 0;
             for (int i = 0 ; i < numberstr.length(); i++){
                 number[i] = number[i]*j+count;
                 count = number[i]/10;
                 number[i] %= 10;
//                 if (count!=0){
//                     number[i] +=count;
//                     count = 0;
//                 }
//                 if (number[i]>=10){
//                     count = number[i]/10;
//                     number[i] %= 10;
//                 }
             }
             if (!find(number)){
                 System.out.println("0");
                 System.exit(0);
             }
             for (int i = 0 ; i<number.length; i++)
                 number[i] = newnumber[i];
         }
        System.out.println("1");

    }
}
