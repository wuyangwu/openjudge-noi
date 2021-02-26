package NOIGo.b1.b19;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 14:45
 */
public class b08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double sum=0,sums=0;
        double[] number = new double[n];
        for (int i = 0 ; i < n ; i++){
            number[i] = scanner.nextDouble();
            sum +=number[i];
        }

        double max = number[0] , min = number[0];
        for (int i = 0 ; i < n ; i++){
            if (number[i]>max){
                max = number[i];
            }
            if (number[i]<min){
                min = number[i];
            }
        }
        sum = (sum-max-min)/(n-2);
        double maxs = 0;
        for (int i = 0 ; i < n ; i++){
            if (max!=number[i]&&min!=number[i]){
                if (maxs<(number[i]-sum)){
                    maxs = number[i]-sum;
                }
            }
        }
        System.out.println(String.format("%.2f",sum)+" "+String.format("%.2f",maxs));
    }
}
