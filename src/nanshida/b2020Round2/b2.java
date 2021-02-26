package nanshida.b2020Round2;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 16:03
 */
public class b2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        int a=0 , b=0, sum1=0,sum2=0;
        for (int i = 0; i <s1.length();i++){
            if (s1.charAt(i)>='a'&&s1.charAt(i)<='z'){
                a++;
            }else {
              if (s1.charAt(i)>='A'&&s1.charAt(i)<='Z'){
                  b++;
              }
            }
        }
        sum1 = b-a;
        a =0;
        b=0;
        for (int i = 0; i <s2.length();i++){
            if (s2.charAt(i)>='a'&&s2.charAt(i)<='z'){
                a++;
            }else {
                if (s2.charAt(i)>='A'&&s2.charAt(i)<='Z'){
                    b++;
                }
            }
        }
        sum2 = b-a;
        System.out.println(sum1+" "+sum2);
    }
}
