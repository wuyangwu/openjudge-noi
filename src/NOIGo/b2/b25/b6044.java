package NOIGo.b2.b25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/10 13:59  鸣人救佐助
 */
class Mingren{
    int x , y;
    int chakala;
    int count;
   public Mingren(int x , int y, int chakala , int count){
        this.x = x;
        this.y = y;
        this.chakala = chakala;
        this.count = count; 
    }
}
public class b6044 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);
        int mx = 0 , my = 0, zx = 0, zy = 0;
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        String[] ditu = new String[m];
        int[][] a = new int[m][m];
        for (int i = 0 ; i< m; i++)
            ditu[i] = scanner.next();
        for (int i =0 ; i< m; i++){
            if (ditu[i].indexOf('@') >=0 ){
                mx = i;
                my = ditu[i].indexOf('@');
            }
            if (ditu[i].indexOf('+') >=0 ){
                zx = i;
                zy = ditu[i].indexOf('+');
            }
        }
        Queue<Mingren> queue = new LinkedList<>();
        queue.add(new Mingren(mx,my,t,0));
        a[mx][my] = 1;
        boolean success = false;
        while (!queue.isEmpty()){
            Mingren mingren = queue.peek();
            if (mingren.x == zx&&mingren.y == zy){
                System.out.println(mingren.count);
                success = true;
                break;
            }
            for (int i = 0; i< 4; i++){
                int xx = mingren.x + dx[i];
                int yy = mingren.y + dy[i];
                if (xx>=0&&xx<=m-1&&yy>=0&&yy<=n-1){
                    if (ditu[xx].charAt(yy) == '#'&&mingren.chakala<1){
                        continue;
                    }
                    int k = ditu[xx].charAt(yy) == '#' ? mingren.chakala - 1 : mingren.chakala;
                    if (a[xx][yy] == 0) {
                        queue.offer(new Mingren(xx,yy,k,mingren.count+1));
                           a[xx][yy] = 1;
                    }
//                    if (mingren.chakala-1>=0 && ditu[xx].charAt(yy) =='#'){
//                        queue.add(new Mingren(xx,yy,mingren.chakala-1,mingren.count+1));
//                        a[xx][yy] = 1;
//                    }else {
//                       if (ditu[xx].charAt(yy) != '#'){
//                           queue.add(new Mingren(xx,yy,mingren.chakala,mingren.count+1));
//                           a[xx][yy] = 1;
//                       }
//                    }

                }
            }
            queue.poll();
        }
        if (!success){
            System.out.println("-1");
        }
    }
}
