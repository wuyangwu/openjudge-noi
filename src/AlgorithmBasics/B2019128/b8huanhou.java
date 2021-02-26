package AlgorithmBasics.B2019128;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/28 23:07
 */
public class b8huanhou {
    static int sum = 0;
    static int[] answer = new int[8];
    static int[][] number = new int[100][8];
    static void digui(int num){
        if (num == 8){
            // 做判断是否是旋转的
            int count= 0;
            if (sum!=0){
                for (int i = 0 ; i < sum;i++){
                    int[][] a = new int[8][8];
                    int[][] b = new int[8][8];
                    for (int j = 0 ; j<8;j++){
                        a[j][ number[i][j]] =1;
                        b[j][answer[j]] = 1;
                    }
                    //旋转 90度
                    int j = 0;
                    for (j = 0 ; j < 8; j++){
                        int k =0;
                        for (k = 0 ; k< 8 ; k++){
                            //||b[j][k]!=a[7-j][7-k]||b[j][k]= a[7-k][j]
                            if (a[j][k] != b[k][7-j]){
                                break;
                            }
                        }
                        if (k!=8){
                            break;
                        }
                    }
                    if (j==8){
                        count =1;
                    }
                    //旋转 180度
                    for (j = 0 ; j < 8; j++){
                        int k =0;
                        for (k = 0 ; k< 8 ; k++){
                            //||b[j][k]!=a[7-j][7-k]||b[j][k]= a[7-k][j]
                            if (a[j][k]!=b[7-j][7-k]){
                                break;
                            }
                        }
                        if (k!=8){
                            break;
                        }
                    }
                    if (j==8){
                        count =1;
                    }
                    //旋转270度
                    for (j = 0 ; j < 8; j++){
                        int k =0;
                        for (k = 0 ; k< 8 ; k++){
                            //||b[j][k]!=a[7-j][7-k]||b[j][k]= a[7-k][j]
                            if (a[j][k] != b[7-k][j]){
                                break;
                            }
                        }
                        if (k!=8){
                            break;
                        }
                    }
                    if (j==8){
                        count =1;
                    }
                    if (count == 1){
                        break;
                    }

                }
             }
        if (count == 0){
            for (int i = 0 ; i <8; i++){
                number[sum][i] = answer[i];
                System.out.print(answer[i]+" ");

            }
            System.out.println();
            sum++;
        }

        }
        // num代表行数
        for (int i = 0 ; i<8; i++){ // 第几个lieshu
            int j = 0;
            for ( ;  j <num ;j ++){
                if (Math.abs(answer[j]-i)==Math.abs(num-j)||answer[j]==i){
                    break;
                }
            }
            if (j==num){
                answer[num] = i;
                // 符合条件存入值
                digui(num+1);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
        digui(0);
        System.out.println(sum);
    }
}
