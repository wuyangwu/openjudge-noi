package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 19:45
 */
public class 字符串的输入输出处理 {
    public static void main(String[] argss){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strs = new String[n+1];
        scanner.nextLine();
        for (int i = 0; i<=n;i++){
            strs[i] = scanner.nextLine();
        }
        for (int i =0; i< n;i++){
            System.out.println(strs[i]);
            System.out.println();
        }
        String[] strings = strs[n].split(" ");
        for (int i= 0; i< strings.length; i++){
            System.out.println(strings[i]);
            System.out.println();
        }
    }
}
