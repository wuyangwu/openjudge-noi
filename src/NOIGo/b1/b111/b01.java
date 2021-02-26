package NOIGo.b1.b111;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/27 21:34
 */
public class b01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0 ; i< n; i++)
            number[i] = scanner.nextInt();
        int m = scanner.nextInt();
        int[] chaxun = new int[m];
        for (int i= 0 ; i< m;i++)
            chaxun[i] = scanner.nextInt();

        Arrays.sort(number,0,n);
        for (int i = 0 ; i < m ; i++){
            int j =0 ;
            int center = 0;
            int jlength = n-1;
            int minnumber = 0;
            if (n != 1){
            while (j<=jlength-1){
                center = j+ (jlength-j)/2;
                if (chaxun[i]==number[center]){
                    minnumber = number[center];
                    break;
                }else {
                    if (Math.abs(number[j]-chaxun[i])<=Math.abs(number[j+1]-chaxun[i])){
                        minnumber = number[j];
                    }else {
                        minnumber = number[j+1];
                    }
                }
                if (chaxun[i]>number[center]){
                    j = center+1;
                }
                if (chaxun[i]<number[center]){
                    jlength = center-1;
                }

            }
                System.out.println(minnumber);
            }else {
                System.out.println(number[0]);
            }

        }

    }
}
