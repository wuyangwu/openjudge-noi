package NOIGo.b2.b24;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0  第前k大的数 7617:输出前k大的数
 * @date 2020/2/16 22:27
 */
public class b7617 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] number = new Integer[n];
        for (int i = 0; i< n;i++){
            number[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        Arrays.sort(number,Collections.reverseOrder());
        for (int i = 0; i<m;i++){
            System.out.println(number[i]);
        }
    }
}
