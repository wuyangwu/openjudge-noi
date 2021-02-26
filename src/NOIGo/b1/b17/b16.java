package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/22 15:02
 */
public class b16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        String n = scanner.nextLine();
        int k = m.compareToIgnoreCase(n);
        System.out.println(k);
        if (k == 0){
            System.out.println("=");
        }else {
            if (k >0)
                System.out.println(">");
            else
                System.out.println("<");
        }
    }
}
