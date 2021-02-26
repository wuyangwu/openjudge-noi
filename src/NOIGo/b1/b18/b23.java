package NOIGo.b1.b18;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 14:02
 */
public class b23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] number = new int[row+1][col+1];
        int[][] numbers = new int[row+1][col+1];
        for (int i = 1 ; i<=row; i++){
            for (int j = 1 ; j <=col; j++){
                number[i][j] = scanner.nextInt();
            }
        }
        for (int q = 1 ; q<=row/2+1; q++){
            for (int i = q ; i<=col-q+1;i++){
                for (int j = q; j<=row-q+1;j++){
                    if (i==q||j==row-q+1){
                        System.out.println(number[i][j]);
                        numbers[i][j] = 1;
                    }
                }
            }
            for (int i = col-q+1; i>=q;i--){
                for (int j = row-q+1; j>=q;j--){
                    if ((i==col-q+1||j==q)&&numbers[i][j]==0){
                        System.out.println(number[i][j]);
                    }
                }
            }
        }
    }
}
