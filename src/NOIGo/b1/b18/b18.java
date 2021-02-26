package NOIGo.b1.b18;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/26 13:27
 */
public class b18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] number = new int[n][n];
        for (int i = 0; i<n;i++){
            for (int j = 0; j<n;j++){
                number[i][j] = scanner.nextInt();
            }
        }

    }
}
