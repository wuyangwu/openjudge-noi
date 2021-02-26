package dotcpp;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 23:26
 */
public class 三个字符串的排序 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i =0 ;i < 3; i++)
            strings[i] = scanner.next();
        Arrays.sort(strings,0,3);
        for (int i =0 ; i< 3;i++){
            System.out.println(strings[i]);
        }
    }
}
