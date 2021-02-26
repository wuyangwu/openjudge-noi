package NOIGo.b2.b25;

import java.util.Scanner;
public class 迷宫 {
	 static void dfs(int i ,int j,String[] strs,int[][] number){
	        if (strs[i].charAt(j) == '#'||number[i][j] == 1)
	            return;
	        number[i][j] = 1;
	        // 上   下   左   右
	        if (j<strs[0].length()-1)
	            dfs(i,j+1,strs,number); // 右
	        if (i<strs[0].length()-1)
	            dfs(i+1,j,strs,number);// 下
	        if (i>0)
	            dfs(i-1,j,strs,number);//上
	        if (j>0)
	            dfs(i,j-1,strs,number);// 左
	    }


	    public static void main(String[] args){
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        for (int i = 0; i < n ; i++){
	            int m =scanner.nextInt();
	            String[] strs =new String[m];
	            int[][] number = new int[m][m];
	            for (int j = 0 ; j<m;j++){
	                strs[j] = scanner.next();
	            }
	            int ha = scanner.nextInt();
	            int la = scanner.nextInt();
	            int hb = scanner.nextInt();
	            int lb = scanner.nextInt();
	            dfs(ha,la,strs,number);
	            if (number[hb][lb]==1)
	                System.out.println("YES");
	            else System.out.println("NO");
	        }
	    }
}
