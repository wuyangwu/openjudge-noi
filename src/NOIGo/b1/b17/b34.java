package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/25 21:19
 */
public class b34 {

    static boolean pandan(String m){
        for (int i = 0;i <= m.length()/2;i++){
            if (m.charAt(i) != m.charAt(m.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String m = scanner.next();
        for (int i = 2 ; i<=m.length(); i++){
            for (int j = 0; j<=m.length()-i; j++){
                if (pandan(m.substring(j,j+i))){
                    System.out.println(m.substring(j,j+i));
                }
            }
        }
    }
}
