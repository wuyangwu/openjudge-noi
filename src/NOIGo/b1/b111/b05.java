package NOIGo.b1.b111;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/28 14:59
 */
public class b05 {
    // 中间值. 蛋糕数. 人数
    static boolean find(double mind,double[] numbers,int f){
        int count = 0;
        for (int i = 0 ; i < numbers.length; i++){
            count += numbers[i]/mind;
        }
        if (count>=f+1){
            return true; // 满足条件蛋糕还可以再大点
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int f = scanner.nextInt();
        double[] numbers = new double[n];
        for (int i = 0 ; i < n; i++){
            double r = scanner.nextDouble();
            numbers[i] = Math.PI*r*r;
        }
        Arrays.sort(numbers,0,n);
        double max  = numbers[n-1]; // 最大不可能打过最大的蛋糕
        double min = 0;
        double center = 0;
        double ans = 0;
        while (min<=max){
            center = min + (max-min)/2;
            if (find(center,numbers,f)){
                ans = center;
                min = center+0.00001;
            }
            else{
                max = center-0.00001;
            }
        }
//        System.out.println(String.format("%.3f",center));
        System.out.println(String.format("%.3f",ans));
    }
}
