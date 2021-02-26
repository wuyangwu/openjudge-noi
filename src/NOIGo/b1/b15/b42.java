package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 23:04
 */
public class b42 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        char s = scanner.next().charAt(0);
        int p = scanner.nextInt();
        for (int i = 1; i <=m ; i++) {
            for (int j = 1 ; j <=n ; j ++){
                if(i == 1 || j== n||j==1||i==n)
                    System.out.print(s);
                else {
                    if(p == 0){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(s);
                    }
                };
            }
            System.out.println();
        }
    }
}
