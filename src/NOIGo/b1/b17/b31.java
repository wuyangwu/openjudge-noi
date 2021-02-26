package NOIGo.b1.b17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/23 0:44
 */
public class b31 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int i =1;
        int k =1;
        int c = 1;
        int[] a = new int[str.length()];
        int[] b = new int[str.length()];
        a[0] = str.charAt(0)-'0';
        while (i<str.length()){
            if (str.charAt(i) == str.charAt(i-1)){
                k++;
            }else {
                a[c] = str.charAt(i)-'0';
                b[c-1] = k;
                c++;
                k=1;
            }
            i++;
        }
        b[c-1] = k;
        for ( i = 0 ; i < c; i++){
            System.out.print(b[i]);
            System.out.print(a[i]);
        }
    }
}
