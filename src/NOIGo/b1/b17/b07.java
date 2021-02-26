package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/22 14:34
 */
public class b07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        for (int i = 0 ; i< n.length(); i++){
            switch (n.charAt(i)){
                case 'A':
                    System.out.print("T");
                    break;
                case 'T':
                    System.out.print("A");
                    break;
                case 'G':
                    System.out.print("C");
                    break;
                case 'C':
                    System.out.print("G");
                    break;
            }
        }
    }
}
