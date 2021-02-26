package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/21 19:05
 */
public class 迭代法求平方根 {

    static double digui(double x,double x1,double x2){
        if (Math.abs(x1-x2)<0.00001)
            return x2;
        return digui(x,x2,(x2+x/x2)/2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double x1 = x/2;
        double x2 = (x1+x/x1)/2;
        System.out.println(String.format("%.3f",digui(x,x1,x2)));

    }
}
