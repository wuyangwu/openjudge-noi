package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 16:46 这个方法正确率是83%
 */
public class b1433 {
    static int[][] number = new int[1010][2];
    static int n = 0;
    static int m =0;
    static boolean zoutong =false;
    static int sum = 0;
    // 是否能走通
    static void dfs(int biaoji[], int mx,int my,int dx,int dy){
        if (mx == dx && my == dy){
            zoutong = true;
        }
        if (!zoutong){
            for (int i = 1; i<=n-1; i++){
                if (my == number[i][0]&&biaoji[number[i][1]]==0){
                    biaoji[number[i][1]] =1;
                    dfs(biaoji,mx,number[i][1],dx,dy);
                    biaoji[number[i][1]] =0;
                }
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
        if (!zoutong == true){
            System.out.println("-1");
            System.exit(0);
        }
        for (int k =u+1;k<v;k++){
            zoutong =false;
            biaoji[k] = 1;
            for (int i = 1; i<= n-1; i++){
                if (number[i][0]==u&&biaoji[number[i][1]]==0){
                    biaoji[number[i][0]] =1;
                    biaoji[number[i][1]] = 1;
                    dfs(biaoji,number[i][0],number[i][1],u,v);
                    biaoji = new int[m+1];
                }
            }
            if (!zoutong){
                sum++;
            }
            biaoji = new int[m+1];
        }
        System.out.println(sum);
    }
}
