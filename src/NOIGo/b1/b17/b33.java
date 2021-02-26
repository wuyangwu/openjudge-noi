package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/25 21:02 回文数
 */
public class b33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
            for (int i = 0;i < n.length()/2;i++){
                if (n.charAt(i) != n.charAt(n.length()-1-i)){
                    System.out.println("no");
                    System.exit(0);
                }
            }
            System.out.println("yes");
    }
}
