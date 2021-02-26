package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 18:37
 */
public class 危险系数 {
    static int arr[][];// 地图
    static boolean test[];// 记录站点
    static int text[];
    static int[] user;
    static int result = 0;// 可以走通的通道数
    static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();// 站点数
        int m = scanner.nextInt();// 通道数
        arr = new int[n][n];// 模拟站点地图;
        test = new boolean[n];// 记录站点是否走过
        text = new int[n];// 记录那些站点走过
        user = new int[n];// 记录每个站点经历的次数
        for (int i = 0; i < m; i++) {// 地图数据导入
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[a-1][b-1] = arr[b-1][a-1] = 1;// 1表示可以走通 默认为0
        }
        int x = scanner.nextInt();// 起点
        int y = scanner.nextInt();// 终点
        dfs(x-1, y-1, 0);// 深度优先遍历
        int sum = 0;
        for (int i = 0; i < user.length; i++) {
            if (user[i] == result) {
                sum++;
            }
        }
            System.out.println(sum-2);
    }
    /**
     *
     * @param x
     *            当前所在的站点
     * @param y
     *            终点
     * @param temp
     *            当前步数
     */
    private static void dfs(int x, int y, int temp) {
        test[x] = true;// 如果走过则为真
        text[temp] = x;// 走过的站点
        if (x == y) {// 如果此条件成立代表已经到达终点
            result++;// 如果可以走通则加1
            for (int i = 0; i <=temp; i++) {
                int s = text[i];// 走到终点将经过的站点取出
                user[s]++;// 将经过的站点次数加一 表示走过一次
            }
        }
        for (int i = 0; i < n; i++) {// 循环遍历地图
            if (arr[x][i] == 1 && test[i] == false) {// 找到可以走的站点
                // arr[x][i]==1代表站点是相通的,test[i]=false代表站点是没有走过的
                dfs(i, y, temp + 1);// temp+1为往前走一步
                test[i] = false;// 走完之后进行初始化
            }
        }
    }
}
