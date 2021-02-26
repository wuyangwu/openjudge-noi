package nanshida.b2020Round1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * 5 5
 * 1 2 3 9 10 （苹果能够到的高度）
 * 6 7 8 9 10  （ 陶陶的高度）
 * @date 2020/2/4 15:18
 */
public class b6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] numbern = new int[n];
        int[] numberm = new int[m];
        for (int i = 0; i < n ; i++)
            numbern[i] = scanner.nextInt();
        for (int i = 0; i < m; i++)
            numberm[i] = scanner.nextInt();
        Arrays.sort(numbern,0,n);
        Arrays.sort(numberm,0,m);
        int count = m;
        for (int i = 0; i < n ; i++){
            for (int j = 0 ; j <m ; j++){
                if (numbern[i]>numberm[j]&&numberm[j]!=-1&&numberm[j]!=0){
                    numberm[j] = -1;
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);

    }
}
