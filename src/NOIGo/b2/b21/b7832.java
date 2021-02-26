package NOIGo.b2.b21;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/15 15:07
 */
public class b7832 {
    static  int maxNumber(int m, int n){
        if (m%n==0)
            return n;
        return maxNumber(n,m%n);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println(maxNumber(50,93));
        int n = scanner.nextInt();
        int maxx = 0, maxy=0;
        double max = 0;
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        for (int i = n ; i>=1; i--){
            for (double j = 1.0 ; ; j++){
                if (j*1.0/i>=a/b) break;;
                if (max<j/i){
                    max = j/i;
                    maxx = (int) (j/maxNumber(i,(int)j));
                    maxy = (int)i/maxNumber(i, (int) j);
                }

            }
        }
        System.out.println(maxx+" "+maxy);
    }
}
