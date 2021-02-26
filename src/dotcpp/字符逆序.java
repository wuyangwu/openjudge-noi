package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 19:38
 */
public class 字符逆序 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String strs = scanner.nextLine();
        for (int i = strs.length()-1;i>=0;i--){
            System.out.print(strs.charAt(i));
        }
    }
}
