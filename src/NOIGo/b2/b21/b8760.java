package NOIGo.b2.b21;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0 Cantor表
 * @date 2020/2/14 16:03
 */
public class b8760 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double number = (Math.sqrt(1+8*n)-1)/2;
        int a = (int) number;
        int fenzi =0 , fenmu = 0;
        if (number-a!=0)
            a +=1;
        if (a %2==0){
            //偶数 分子加分母之和为 a+1
            fenzi = n - (a*(a-1))/2;
            fenmu = a+1-fenzi;
        }else {
            //奇数 分子加分母之和为 a+1
            fenmu = n - (a*(a-1))/2;
            fenzi = a+1-fenmu;
        }
    //        System.out.println((Math.sqrt(1+8*n)-1)/2);

        System.out.println(fenzi+"/"+fenmu);
    }
}
