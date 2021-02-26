package NOIGo.b1.b15;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/20 21:32
 */
public class b15 {

//    static double zhi(double r , double m , int y){
//
//        for (int i = 0 ; i < y; i ++){
//            m = m*r;
//        }
//        return m;
//    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextInt();
        double m = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 0 ; i < y; i++){
            m = m*(1+r/100);
        }
        System.out.println((int)(m));
    }
}
