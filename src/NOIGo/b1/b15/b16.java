package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 22:06
 */
public class b16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double k = scanner.nextInt();
        double sum = 200;
        int sums = n;
        int M;
        for ( M = 2; M <= 21; M++){
            sum= sum*(1+k/100);
            sums += n;
            if(sums>=sum)
                break;
        }
        if(M>20){
            System.out.println("Impossible");
        }else {
            System.out.println(M);
        }
    }
}
