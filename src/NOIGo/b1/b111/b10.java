package NOIGo.b1.b111;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/29 0:19
 */
public class b10 {

    static boolean find(int mind,int m,int[] number,int l){
        int sum =0;
        int count = 0;
        for (int i = 0; i < number.length; i++){
            if (number[i]-sum<mind){
                count++;
            }else {
                sum = number[i];
            }
        }
        if (l - sum<mind){
            count++;
        }
        if (count<=m){
            return true;  //值小了
        }else {
            return false; // 值大了
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] number = new int[n];
        int min = 1000000000;
        for (int i = 0 ; i < n; i++){
            number[i] = scanner.nextInt();
            min = Math.min(min,number[i]);
        }

        int j = 0;
        int jlength = l;
        int center = 0;
        int ans =0;
        while (j<=jlength){
            center = j +(jlength-j)/2;
            if (find(center,m,number,l)) {
                ans = center;
                j = center + 1;
            }
            else{ jlength= center-1;}
        }
        System.out.println(ans);
//        System.out.println(center);
    }
}
