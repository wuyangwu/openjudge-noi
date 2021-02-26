package NOIGo.b1.b17;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/22 21:47
 */
public class b27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        String[] strs = m.trim().split(" ");
        for (int i = 0; i<strs.length; i++){
            if (strs[i].length() == 0){
                System.out.print(" ");
            }else {
                if (i!=0){
                    System.out.print(" ");
                }
                for (int j = strs[i].length() -1; j>=0; j--){
                    System.out.print(strs[i].charAt(j));
                }
            }
        }
    }
}
