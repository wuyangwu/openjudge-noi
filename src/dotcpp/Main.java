package dotcpp;

import java.util.Scanner;



public class Main{

private static int m;

private static int step[][]=new int[][]{{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};

private static int[][] v=new int[2][1002];

private static int mun=0;

public static void main(String[] args) {

Scanner input=new Scanner(System.in);

m=input.nextInt();

for (int i = 0; i <2; i++) {

for (int j = 0; j <m; j++) {

v[i][j]=1;

dfs(0,i,j);

v[i][j]=0;

}

}

System.out.println(mun);

}



private static void dfs(int count, int x, int y) {

if(count==m*2-1){

mun++;

if(mun==1000000007)mun=0;

return;

}

for (int i = 0; i < 8; i++) {

int x1=x+step[i][0];

int y1=y+step[i][1];

if(x1<0||y1<0||x1>1||y1>=m)continue;

if(v[x1][y1]==0){

v[x1][y1]=1;

dfs(count+1,x1,y1);

v[x1][y1]=0;

}

}

}

}

