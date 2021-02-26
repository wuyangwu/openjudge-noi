package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 20:14
 */
public class b14362 {
    static int  n=0,m=0,k=0 ;
    static int[][] number = new int[52][52]; // 录入的宝物的价值
    static int mod = 1000000007;//取余值
    static int[][][][] prices = new int[52][52][15][15]; // 这个是当你在 x,y为几的时候手上的有几个宝贝，价值是多少 ，存的值是有几个方案

    static int dfs(int i, int j ,int count , int max){
        if (i == n||j==m)
            return 0;
        //  入口的方法数已更新，即已经搜索完毕
        if(prices[i][j][count][max+1]!=-1) {//因为max初值设为-1，不+1会下越界
            return prices[i][j][count][max+1];
        }
        int sum = 0; // 方法数
        if (i==n-1&&j==m-1){ // 到达出口
            // 满足条件+1；
            if (count == k || count==k-1&&number[i][j] >max)
                return 1;
            else return 0;
        }

            if (number[i][j]>max){
                sum += dfs(i+1,j,count+1,number[i][j]);
                count %= mod;
            }
            sum += dfs(i+1,j,count,max);
            sum %= mod;



            if (number[i][j]>max){
                sum += dfs(i,j+1,count+1,number[i][j]);
                sum %= mod;
            }
            sum += dfs(i,j+1,count,max);
            sum %= mod;
            prices[i][j][count][max+1] = sum;
            return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt(); m = scanner.nextInt(); k = scanner.nextInt();
        for (int i =0 ; i< n;i++){
            for (int j = 0; j < m;j++){
                number[i][j] = scanner.nextInt();
            }
        }

        // 格式化 prices
        for (int i = 0; i<52;i++){
            for (int j = 0; j<52;j++){
                for (int k = 0; k<15;k++){
                    for (int l =0; l <15;l++){
                        prices[i][j][k][l] = -1;
                    }
                }
            }
        }


        System.out.println(dfs(0,0,0,-1));
    }
}
