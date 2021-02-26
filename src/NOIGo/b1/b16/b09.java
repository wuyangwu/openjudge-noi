package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/21 16:42
 */
public class b09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[210];
        int[] b = new int[210];
        String a1 = scanner.next();
        String b1 = scanner.next();
        int length = a1.length();
        for (int i = 0; i<a1.length(); i++){
            a[length-i-1] = a1.charAt(i)-'0';
        }
         length = b1.length();
        for (int i = 0 ; i <b1.length() ; i++){
            b[length-i-1] = b1.charAt(i)-'0';
        }
        int max  = a1.length()>b1.length()? a1.length()+1 : b1.length()+1;
        for (int i = 0; i <max;i++){
            a[i] += b[i];
            if (a[i]>= 10){
                a[i+1]++;
                a[i] -= 10;
            }
        }
        int s =max;
        while (a[s]==0){
            s--;
            if(s==0){
                break;
            }
        }
        for (int i = s; i >=0; i--){
            System.out.print(a[i]);
        }
    }
}
