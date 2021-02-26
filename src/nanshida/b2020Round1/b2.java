package nanshida.b2020Round1;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/4 13:53
 */
public class b2 {

    static int digui(int m){
        if (m == 1||m==2){
            return 1;
        }
        return digui(m-1)+digui(m-2);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int sum = 0;
        for (int i = k1; i <= k2; i++){
            sum += digui(i);
        }
        System.out.println(sum);
    }
}
