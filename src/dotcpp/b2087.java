package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 13:54
 */
public class b2087 {
    static int[][] numbers = new int[8][8]; // 录入数字
    static int max = 0; // 最大的数
    static int[] number = new int[8]; // 8皇后的满足的位置

    static void dfs(int m){
        if (m==8){
            int sum =0;
            for (int i = 0; i< 8;i++){
                sum += numbers[i][number[i]];
            }
            if (sum>max){
                max = sum;
            }
        }

        // 哪一列
        for (int i =0; i< 8;i++){
            // 判断是否满足条件
            int j = 0;
            for (; j<m;j++){
                // 不能再同一列 和一个对角线
                if (number[j] == i||Math.abs(m-j)==Math.abs(i-number[j]) ){
                    break;
                }
            }
            if (j==m){
                number[m] = i;
                dfs(m+1);
            }

        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i<8;i++){
            for (int j = 0; j<8;j++){
                numbers[i][j] = scanner.nextInt();
            }
        }
        dfs(0);
        System.out.println(max);
    }
}
