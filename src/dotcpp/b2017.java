package dotcpp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 14:54 问题 2107: 误落迷宫2 bfs
 */

class weizhi{
    int x =0,y=0;
    int count = 0;
    weizhi(int x, int y, int count){
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
public class b2017 {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum =0;
        String[] ditu = new String[n];
        int xs=0,ys=0,xt=0,yt=0,xe=0,ye=0;
        for (int i =0 ;i<n; i++){
            ditu[i] = scanner.next();

            for (int j = 0; j < m;j++){
                // 获取起始位置
                if (ditu[i].charAt(j) == 'S'){
                    xs = i;
                    ys = j;
                }
                // 获取三夫人位置
                if (ditu[i].charAt(j) == 'T'){
                    xt = i;
                    yt = j;
                }
                // 获取出口位置
                if (ditu[i].charAt(j) == 'E'){
                    xe = i;
                    ye = j;
                }
            }
        }

        // 我的思路是 先起点找到三夫人 ，再从三夫人为起点找到终点
        for (int i = 0; i<2; i++){
            int[][]  biaoji = new int[n][m]; // 标记
            Queue<weizhi> queue  = new LinkedList<>();
            int x = i==0? xs:xt ;
            int y = i==0? ys:yt ;
            queue.add(new weizhi(x,y,0));
            biaoji[x][y] = 1;
            while (!queue.isEmpty()){
                weizhi weizhi = queue.peek(); // 只读不拿
                if (i == 0){
                    if (weizhi.x ==xt && weizhi.y == yt){
                        sum += weizhi.count;
                        break;
                    }
                }else {
                    if (weizhi.x ==xe && weizhi.y == ye){
                        sum += weizhi.count;
                        break;
                    }
                }

                // 上下左右
                for (int k =0 ; k <4; k++){
                    int dxx = weizhi.x + dx[k];
                    int dyy = weizhi.y + dy[k];
                    if (dxx>=0&&dxx<=n-1&&dyy>=0&&dyy<=m-1&&biaoji[dxx][dyy]!=1&&ditu[dxx].charAt(dyy)!='1'){
                        queue.add(new weizhi(dxx,dyy,weizhi.count+1));
                        biaoji[dxx][dyy] =1;
                    }
                }

                queue.poll();
            }
        }
        System.out.println(sum);


    }
}
