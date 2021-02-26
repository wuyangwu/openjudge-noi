package xiaosai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 21:42
 */
public class b8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = {0,9,1,3,5,2,7,6,3};
        int c[] = new int[n];
        int k = 2;
        int s = 1;
        int count = 0;
        while (k<n){
            while (k<n&&a[k]<a[s]){
                k++;
                s++;
                c[count]++;
            }
            while (k<n&&a[k]>=a[s]){
                count++;
                s =k;
                k++;
            }
        }
//        System.out.println();
    }
}
