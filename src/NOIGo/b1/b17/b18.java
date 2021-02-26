package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/22 20:45 验证子串 indexof可以查找
 */
public class b18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String  m = scanner.nextLine();
        String  n = scanner.nextLine();
        int max = Math.max(m.length(),n.length());
        int min = Math.min(m.length(),n.length());
        if (m.length()<n.length()){
            String s = m;
            m = n;
            n =s;
        }
        int i =0;
        int j = 0;
        System.out.println(m.indexOf(n));
        if (m.indexOf(n)>=0){
            System.out.println(n+" is substring of "+m);
        }else {
            System.out.println("No substring");
        }


    }
}
