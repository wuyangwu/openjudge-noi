package AlgorithmBasics.b20200209;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0   bfs算法迷宫问题
 * @date 2020/2/9 14:20
 */
class ditu{
    int x;
    int y;
    int count;
   public ditu(int x,int y , int count){
        this.x = x;
        this.y = y;
        this.count = count;
    }
}
public class b1 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt(); // 地图行
        int c = scanner.nextInt(); // 地图长
        int dx[]={1,-1,0,0},dy[]={0,0,1,-1};
        String[] ditus = new String[r];
        int[][] dp =new int[r][c];
        for (int i = 0 ; i<r; i++)
            ditus[i] = scanner.next();
        Queue<ditu> queue = new LinkedList<>();
        queue.add(new ditu(0,0,1)); // 把初始位置放入队列
        dp[0][0] = 1;
        while (!queue.isEmpty()){
            ditu ditu = queue.peek(); // 取出不消耗
            if (ditu.x == r-1 && ditu.y==c-1){
                System.out.println(ditu.count);
                System.exit(0);
            }
            //只需要往右和下移动
            for (int i = 0; i<4;i++){
                int xx = ditu.x+dx[i],yy=ditu.y+dy[i];
                if (xx>=0&&xx<=r-1&&yy>=0&&yy<=c-1&&dp[xx][yy]==0&&ditus[xx].charAt(yy)!='#'){
                    queue.add(new ditu(xx,yy,ditu.count+1));
                    dp[xx][yy] = 1;
                }
            }
//            if (ditu.y<c-1){
//                if (ditus[ditu.x].charAt(ditu.y+1)=='.')
//                    queue.add(new ditu(ditu.x,ditu.y+1,ditu.count+1));
//            }
//            if (ditu.x<r-1){
//                if (ditus[ditu.x+1].charAt(ditu.y)=='.')
//                    queue.add(new ditu(ditu.x+1,ditu.y,ditu.count+1));
//            }
            queue.poll(); // 消耗
        }
    }
}
