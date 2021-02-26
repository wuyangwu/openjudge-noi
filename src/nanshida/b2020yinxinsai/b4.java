package nanshida.b2020yinxinsai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0参考
 * 10 2 1
 * 50 5
 * 10 2
 * @date 2020/1/23 15:48
 */
public class b4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] number = new int[n][2];
        int[][] value = new int[n+1][c+1];
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < 2 ; j++){
                number[i][j] = scanner.nextInt();
            }
        }
        for ( int i =1 ; i <=n; i++){
            int j = 0;
            for ( j= 0 ; j <=c ;j++){
                if (j>=number[i-1][1]){
                    value[i][j] = value[i-1][j-number[i-1][1]] +number[i-1][0];
                    if(value[i][j]< value[i-1][j]){
                        value[i][j] = value[i-1][j];
                    }
                }else {
                    value[i][j] = value[i-1][j];
                }
            }
        }
            for (int j = 0 ; j <=c;j++){
                if (value[n][j]>=v){
                    System.out.println(c-j);
                    System.exit(0);
                }
            }

            System.out.println("Impossible");
    }
}
