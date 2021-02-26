package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 18:53
 */
public class b1436 {
    static int n;//行
    static int m;//列
    static int k;//需取数
    static int mod = 1000000007;//取余值
    static int dp[][][][] = new int[50][50][15][15];//x,y,已取数,最大价值
    // dp数组中记录的是状态   xy坐标 拥有宝物数量 拥有宝物的最大值(这4个可以详尽唯一的描述没一种可能)
    //如dp[3][4][5][6]=7 即当在map[3][4]且身上有5件宝物 宝物的最大值是6 是到达终点有7中路径
    static int map[][] = new int[50][50];//价值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        fill(dp);//因为有的格子不能走，即方法数为0，避免重复搜索，全部置为-1
        System.out.println(dfs(0, 0, 0, -1));//最低价值为0，入口处可取可不取，因此初始最高价值置为-1
    }
    static int dfs(int x, int y, int sum, int max) {
        //越界，比如一直向下一直向右，不可行
        if(x>=n||y>=m||sum>k) {
            return 0;
        }
        //  入口的方法数已更新，即已经搜索完毕
        if(dp[x][y][sum][max+1]!=-1) {//因为max初值设为-1，不+1会下越界
            return dp[x][y][sum][max+1];
        }
        int count=0;//方法数
        int gold=map[x][y];//当前位置的价值
        if(x==n-1&&y==m-1) {//到达出口
            //如果已经有K个或者有k-1个且出口处的价值大于手中价值（即可以拿），即为一种可行方法
            if(sum==k||(sum==k-1&&gold>max)) {
                return 1;
            }
            //到达出口但是宝物不够，不可行
            return 0;
        }
        if(gold>max) {//此处可取，取之，每次相加时取余
            count+=dfs(x+1,y,sum+1,gold);
            count%=mod;
            count+=dfs(x,y+1,sum+1,gold);
            count%=mod;
        }
        //不取（不能取和可取但是没有取两种情况）
        count+=dfs(x+1,y,sum,max);
        count%=mod;
        count+=dfs(x,y+1,sum,max);
        count%=mod;
        //记忆 最优解存入
        dp[x][y][sum][max+1]=count;
        return count;
    }
    static void fill(int[][][][] dp2) {
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                for (int k = 0; k < 15; k++) {
                    for (int l = 0; l < 15; l++) {
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
    }
}
