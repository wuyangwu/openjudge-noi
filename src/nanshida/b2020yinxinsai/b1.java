package nanshida.b2020yinxinsai;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/23 13:06
 */
public class b1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][][] numbers = new int[n][10][10];
        int[][] numbersbiaoshi = new int[10][10];
        int[] numberbiaoshi = new int[10];
        for (int k = 0 ; k < n; k++) {
            for (int i = 0; i < 9; i++) {
                for (int j= 0 ; j<9;j++){
                    numbers[k][i][j] = scanner.nextInt();
                }
            }
        }
        for ( int k = 0 ; k < n ;k++){
            int biaoshi = 0;
            for (int i = 0; i < 9; i++) {
                int j = 0;
                for (j = 0; j < 9; j++) {
                    numbersbiaoshi[i][numbers[k][i][j]] += 1;
                    if (numbersbiaoshi[i][numbers[k][i][j]] >= 2) {
                        break;
                    }
                    int row = (i / 3) * 3 + (j / 3);
                    int col = (i % 3) * 3 + (j % 3);
                    if (row % 3 == 0 && col % 3 == 0) {
                        numberbiaoshi = new int[10];
                    }
                    numberbiaoshi[numbers[k][row][col]] += 1;
                    if (numberbiaoshi[numbers[k][row][col]] >= 2) {
                        break;
                    }
                }
                if (j != 9) {
                    biaoshi = 1;
                    break;
                }
            }
            if (biaoshi == 1) {
                System.out.println("Wrong");
            } else {
                System.out.println("Right");
            }
        }
    }
}
