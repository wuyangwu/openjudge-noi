package xiaosai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/15 20:53
 */
public class b9 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
//        int a[][] = new int[3][4];
//        int a[][] = {{9,3,3,1},{3,3,3,0},{0,0,0,0}};
        int a[][] = new int[n][m];
        for (int i = 0 ; i< n ; i++){
            for (int j = 0 ; j< m ; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int h = scanner.nextInt();
        int c[] = new int[h+1];
        for (int k = 1 ; k<= h; k++) {
            int s = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(a[i][j]== k) {
                        c[k]++;
                    }
                }
            }
        }
        for (int i =1 ; i<=h; i++){
            int sum = 0;
            for (int j =1 ; j <=h ; j++){
                if( i<=j){
                    sum += i*c[j];
                }
                if(i > j){
                    sum+= j*c[j];
                }
            }
            System.out.println(sum);
        }
    }
}
