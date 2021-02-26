package dotcpp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




class luj{
	String direction; // 方向
	int x,y; // 坐标
	int cout; // 统计步数
	public luj(int x, int y,String direction) {
		this.direction = direction;
		this.x = x;
		this.y = y;
	}
}
public class 学霸的迷宫 {
     static int[][] move= {{1,0},{0,-1},{0,1},{-1,0}};//下 左 右 上  不按这个顺序设置会出错
     static String[] pos= {"D","L","R","U"};//方向数组
     static char[][] map;//保存地图
     static int[][] book;//标记是否走过
     static int n;//地图行
     static int m;//地图列
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        n=0;
        m=0;
        n=scan.nextInt();
        m=scan.nextInt();
        map=new char[n][m];
        book=new int[n][m];
        for(int i=0;i<n;i++)//输入地图
        {
            String s=scan.next();
            map[i]=s.toCharArray();
        }
        Queue<luj> queue=new LinkedList<>();
        queue.offer(new luj(0,0,""));//起始点入队
        book[0][0]=1;//标记为走过
        while(!queue.isEmpty())
        {
            luj luj=queue.poll();//取队头
            if(luj.x==n-1&&luj.y==m-1)//走到目标位置
            {
                System.out.println(luj.direction.length());
                System.out.println(luj.direction);
            }
            for(int i=0;i<4;i++)//循环四个方向
            {
                int mx=luj.x+move[i][0];
                int my=luj.y+move[i][1];
                //没走出界，没走过，且能走
                if(mx>=0&&mx<n&&my>=0&&my<m&&book[mx][my]==0&&map[mx][my]=='0')
                {
                    book[mx][my]=1;
                    String s=luj.direction+pos[i];//作为下一个点的来自前面所有点的走向
                    queue.offer(new luj(mx,my,s));
                }
            }
        }
        scan.close();
    }

}
