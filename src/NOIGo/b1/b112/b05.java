package NOIGo.b1.b112;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/3 15:17
 */
public class b05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nstr = scanner.next();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] strs = str.trim().split(" ");
        int count = 0;
        int counts = 0;
        for (int i = 0 ; i< strs.length; i++){
            if (strs[i].compareToIgnoreCase(nstr)==0){
                count++;
                if (count == 1)
                    counts = i;
            }
        }
        if (count == 0){
            System.out.println("-1");
        }else {
            System.out.println(count+" "+counts);
        }
    }
}
