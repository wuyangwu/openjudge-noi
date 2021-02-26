package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 18:04 第二种方法
 */
public class b14332 {
    static int[][] number = new int[1010][2];
    static int[] counts = new int[1010];
    static int n = 0;
    static int m =0;
    static int sum = 0,count=0;
    // 是否能走通
    static void dfs(int biaoji[], int mx,int my,int dx,int dy){
        if (mx == dx && my == dy){
            sum++;
            for (int i = dx+1;i<dy;i++){
                if (biaoji[i] == 1)
                    counts[i]++;
            }
        }
            for (int i = 1; i<=n-1; i++){
                if (my == number[i][0]&&biaoji[number[i][1]]==0){
                    biaoji[number[i][1]] =1;
                    dfs(biaoji,mx,number[i][1],dx,dy);
                    biaoji[number[i][1]] =0;
                }
            }

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] biaoji = new int[m+1];
        for (int i = 1; i<=n;i++){
            number[i][0] = scanner.nextInt();
            number[i][1] = scanner.nextInt();
        }
        int u = number[n][0];
        int v = number[n][1];
        for (int i = 1; i<= n-1; i++){
            if (number[i][0]==u){
                biaoji[number[i][0]] =1;
                biaoji[number[i][1]] = 1;
                dfs(biaoji,number[i][0],number[i][1],u,v);
                biaoji = new int[m+1];
            }
        }
        if (sum==0){
            System.out.println(-1);
        }else {
            for (int i =u+1;i<v;i++){
                if (counts[i]==sum){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
