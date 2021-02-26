package dotcpp;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/20 15:37 问题 2178: [信息学奥赛一本通-T1255]迷宫问题
 */
class Mi{
    int x =0,y=0;
    int count =0;
    int mx=0,my=0;
    Mi(int x ,int y, int count,int mx , int my){
        this.x = x;
        this.y = y;
        this.count = count;
        this.mx = mx;
        this.my = my;
    }
}
public class b2178 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] number = new int[5][5];
        int[][] biaoji = new int[5][5];
        for (int i = 0; i< 5; i++){
            for (int j= 0; j<5 ; j++ ){
                number[i][j] = scanner.nextInt();
            }
        }
        Mi[] mis = new Mi[100]; // 开一个很大的空间
        int[][] answer = new int[100][2];
        mis[0] = new Mi(0,0,0,0,0);
        biaoji[0][0] = 1;
        int i=0,j=1,l=1;
        while (i<j){
            Mi mi = mis[i];
            // 找到最短路径
            if (mi.x == 4 && mi.y == 4){
                int dx1 = mi.mx,dy1 = mi.my;
                answer[0][0] = mi.x;answer[0][1]=mi.y;
                for (int k =i-1; k>=0; k--){
                    if (mis[k].x==dx1 && mis[k].y==dy1){
                        answer[l][0] = mis[k].x;
                        answer[l][1] = mis[k].y;
                        l++;
                        dx1 = mis[k].mx;
                        dy1 = mis[k].my;
                    }
                }
                break;
            }

            // 上下左右
            for (int k =0 ;k<4;k++){
                int dxx = mi.x+dx[k];
                int dyy = mi.y+dy[k];
                if (dxx>=0&&dxx<=4&&dyy>=0&&dyy<=4&&biaoji[dxx][dyy]!=1&&number[dxx][dyy] == 0){
                    biaoji[dxx][dyy] = 1;
                    mis[j++] = new Mi(dxx,dyy,mi.count+1,mi.x,mi.y);
                }
            }
            i++;
        }
        for (i=l-1; i>=0;i--){
            System.out.println("("+answer[i][0]+", "+answer[i][1]+")");
        }


    }
}
