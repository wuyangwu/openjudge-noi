package NOIGo.b1.b110;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/27 16:55
 */
public class b10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        number = number.trim().replaceAll("\\s+", " ");
        String[] strs = number.split(" ");

        Arrays.sort(strs,0,strs.length);
        for (int i =0 ; i < strs.length-1; i++){
//            System.out.println(strs[i].compareToIgnoreCase(strs[i+1]));
            if (strs[i].compareTo(strs[i+1])==0){
                continue;
            }
            System.out.println(strs[i]);
        }
        System.out.println(strs[strs.length-1]);
    }
}
