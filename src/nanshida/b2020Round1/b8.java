package nanshida.b2020Round1;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/5 14:43
 */
public class b8 {
    static int[][] c = new int[9][3];
    static int[][] d = new int[9][3];
    static int[][] e = new int[9][9];
    static int[] v = new int[9];
    static int w = 99999;
    static int ans,q=0;
    static int[][] a = {{0,0,0,0,0},{0,1,1,1,1},{0,0,0,0,0},{0,1,1,1,0},{0,0,0,1,0}};
    static int[][] b = {{0,0,0,0,0},{0,1,0,1,0},{0,0,1,0,1},{0,1,0,1,0},{0,0,1,0,1}};
    // 找出数组e中最小的值相加和
    static void dfs(int t){
        if (t==9){
            if (ans<w) w=ans;
        }
        for (int i =1; i<=8; i++){
            if (v[i]==0){
                ans += e[t][i];
                v[i] = 1;
                dfs(t+1);
                v[i] = 0;
                ans -= e[t][i];
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=4;i++)
            for(int j=1;j<=4;j++)
            {
//                a[i][j] = scanner.next().charAt(0);
                if(a[i][j]==1)
                {
                    q++;
                    d[q][1]=i;
                    d[q][2]=j;
                }
            }
        q=0;
        for(int i=1;i<=4;i++)
            for(int j=1;j<=4;j++)
            {
//                b[i][j] = scanner.next().charAt(0);
//                cin>>b[i][j];
                if(b[i][j]==1){
                    q++;c[q][1]=i;c[q][2]=j;
                    // 把为一的行和列存下来
                }
            }
        q=0;
        for(int j=1;j<=8;j++){
            for(int i=1;i<=8;i++){
                // 把每个点的位置转移成  每个点的坐标差存入数组，然后每个点的最小差相加就是最小的
                System.out.println(c[i][1]+" "+d[j][1]+" "+c[i][2]+" "+d[j][2]);
                e[i][j]=Math.abs(c[i][1]-d[j][1])+Math.abs(c[i][2]-d[j][2]);
            }
        }

        dfs(1);
        System.out.println(w);
//        cout<<w<<endl;
    }
}
