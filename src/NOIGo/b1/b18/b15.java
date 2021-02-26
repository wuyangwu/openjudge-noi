package NOIGo.b1.b18;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/25 22:22
 */
public class b15 {

    static void memcpy(int[][] number, int[][] numbernew){
        for (int i = 0 ; i< 9; i++){
            for (int j = 0; j< 9; j++){
                number[i][j] = numbernew[i][j];
            }
        }
    }

    static void memset(int[][] numbernew, int b){
        for (int i = 0 ; i< 9; i++){
            for (int j = 0; j< 9; j++){
                numbernew[i][j]=0;
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] number = new int[9][9];  // 老的细胞
        int[][] numbernew = new int[9][9]; // 新的细胞
        number[4][4] = m;
        for (int k = 1 ; k <=n; k++){
            for (int i = 0 ; i < 9 ; i++){
                for (int j = 0; j < 9; j++){
                    if (number[i][j] !=0){
                        // 左中右
                        if (j>0)
                            numbernew[i][j-1] +=number[i][j];
                        if (j<=7)
                            numbernew[i][j+1] +=number[i][j];
                        //左上 上 右上
                        if (i>0){
                            if (j>0)
                                numbernew[i-1][j-1] +=number[i][j];
                            numbernew[i-1][j] +=number[i][j];
                            if (j<=7)
                                numbernew[i-1][j+1] +=number[i][j];
                        }
                        //左下 下 右下
                        if (i<8){
                            if (j>0)
                                numbernew[i+1][j-1] +=number[i][j];
                                numbernew[i+1][j] +=number[i][j];
                            if (j<=7)
                                numbernew[i+1][j+1] +=number[i][j];
                        }
                        numbernew[i][j] += 2*number[i][j];
                    }
                }
            }
            memcpy(number,numbernew);
            memset(numbernew,0);
        }

        for (int i = 0 ; i< 9; i++){
            for (int j = 0; j< 9; j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }
}
