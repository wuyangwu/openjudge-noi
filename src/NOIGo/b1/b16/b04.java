package NOIGo.b1.b16;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0 数组
 * @date 2020/1/21 15:39
 */
public class b04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i <n ; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = n-1 ; i >=0 ; i--){
            System.out.print(a[i]+" ");
        }
    }
}
