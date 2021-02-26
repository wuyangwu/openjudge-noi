package NOIGo.b2.b25;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/9 15:51 红于黑
 */
public class b1818 {

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static String[] ditu = new String[30];
    static int[][] ranse = new int[30][30];
    static int n =0;
    static int m = 0;
    static int sum =0 ;

    static  void dfs(int x , int y){
        if (ditu[x].charAt(y) == '#')
            return;
        ranse[x][y] = 1;
        sum++;
        for (int i = 0; i<4;i++){
            int xx = x+dx[i];
            int yy = y +dy[i];
            if (xx>=0&&xx<=m-1&&yy>=0&&yy<=n-1&&ranse[xx][yy]==0){
                dfs(xx,yy);
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while ((n=scanner.nextInt())!=0 && (m=scanner.nextInt())!=0){
            for (int i = 0; i<m; i++)
                ditu[i] = scanner.next();
            for (int i = 0 ; i<m; i++){
                for (int j = 0 ;  j <n; j++){
                    if (ditu[i].charAt(j)=='@'){
                        dfs(i,j);
                    }
                }
            }
            System.out.println(sum);
            sum = 0;
            ranse  = new int[30][30];
            ditu = new String[30];
        }

    }
}
