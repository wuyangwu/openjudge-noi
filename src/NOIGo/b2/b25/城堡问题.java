package NOIGo.b2.b25;

import java.util.Scanner;

public class 城堡问题 {
//  static int[][] number = new int[4][7]; // 染色数据
//  static int[][] shuju = {{11,6,11,6,3,10,6},{7,9,6,13,5,15,5},{1,10,12,7,13,7,5},{13,11,10,8,10,12,13}}; // 城堡数据
  static int numberroom = 0 ;//房间数据
  static int numbers = 0; // 放入房间的数据
  static int max = 0;
  static void dfs(int i ,int j,int[][] shuju,int[][] number){
      if (number[i][j] != 0)
          return;
      number[i][j] = numbers;
      numberroom++;
      if ((shuju[i][j]&1)==0) dfs(i,j-1,shuju,number); //左边
      if ((shuju[i][j]&2)==0) dfs(i-1,j,shuju,number); // 上边
      if ((shuju[i][j]&4)==0) dfs(i,j+1,shuju,number); //右边
      if ((shuju[i][j]&8)==0) dfs(i+1,j,shuju,number); // 下边
  }
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[][] number =new int[n][m];  // 染色数据
      int[][] shuju = new int[n][m];
      for (int i = 0 ; i< n ; i++){
          for (int j = 0 ; j< m ; j++){
              shuju[i][j] = scanner.nextInt();
          }
      }
      for (int i = 0 ; i< n ; i++){
          for (int j = 0 ; j<m; j++){
              if (number[i][j] == 0){
                  ++numbers;
                  numberroom = 0;
                  dfs(i,j,shuju,number);
                  max = Math.max(numberroom,max);
              }
          }
      }
      System.out.println(numbers);
      System.out.println(max);
  }

}
