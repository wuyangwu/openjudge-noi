package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 22:39
 */
public class b43 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 2 ; i < n; i++){
            if(n%i==0){
                System.out.println(n/i);
                break;
            }
        }

    }
}
