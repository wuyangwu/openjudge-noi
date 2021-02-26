package NOIGo.b1.b18;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/25 21:40
 */
public class b05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] number = new int[5][5];
        int[] col = new int[5];
        int min=0;
        for (int i = 0 ; i <5 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                number[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0 ; i < 5 ; i++){
            int max = number[i][0];
            for (int j = 0 ; j < 5; j++){
                if (number[i][j] > max){
                    max = number[i][j];
                    col[i] = j;
                }
            }
        }
        for (int i = 0; i< 5; i++){
             min = number[i][col[i]];
            int j = 0;
            for (; j < 5; j++){
                if (min >number[j][col[i]]){
                    break;
                }
            }
            if ( j==5){
                System.out.println((i+1)+" "+(col[i]+1)+" "+min);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}
