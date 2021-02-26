package AlgorithmBasics.B2019127;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/7 16:54 皇后问题
 */
public class huanhouProblem {
	  static int n1= 0;
      static int count =0;
   // 这里面用四皇后做了测试，如若用n测试则把 new int[4] , 4改成n，和里面代码部分修改。。。
  static int b[] = new int[4]; // 下标用来控制第几行，里面的值来控制第几个下标的第几列比如 a[1] =3,则是第2行 第4列

  public static void s(int n,int m){
        if(m == n){
         for (int i = 0; i< 4; i++){
             System.out.print(b[i]+" ");
         }
          System.out.println();
          count++;
          return;
      }
      // 这个循环是试探，每一列是否可行，m是用来控制行数
      for(int i = 0 ; i < n; i++){
          int j=0;
          // 下面这个for循环循环的是已经确定的皇后的个数和要放的皇后进行匹配 ，确定要放的皇后的位置是正确的这就是整个算法最重要的思路
          for(j = 0 ; j <m ;j++ ){
             // b[j] == i 是同列的皇后不能放一起，后面是对角线公式，如果两个数在对角线上则其同行相减同列相减的绝对值是相等的。
              if( b[j] == i ||Math.abs(b[j]-i)== Math.abs(m-j)){
                  // 不满足条件的就break满足条件的就继续循环
                  break;
              }
          }
          if(j == m){
              // 存皇后的位置
              b[m] = i;
              s(n,m+1);
          }
      }
  }


  public static void main(String[] args){
  // 仅此输入4，输入其他数字需要修改部分代码。。。。很简单，
   Scanner scanner = new Scanner(System.in);
      n1 = scanner.nextInt();
      long startTime=System.currentTimeMillis(); //获取开始时间
      s(n1 ,0);
      long endTime=System.currentTimeMillis(); //获取结束时间
      System.out.println("程序运行时间："+(endTime-startTime)+"ms");
      System.out.println("一共有多少种"+count);
  }
}
