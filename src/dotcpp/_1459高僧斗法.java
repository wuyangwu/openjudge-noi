package dotcpp;

import java.util.Scanner;

public class _1459高僧斗法 {

	 public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    String[] ss = scanner.nextLine().split(" ");
		    int[] x = new int[ss.length];
		    //将小和尚的位置作为数组元素的值
		    for (int i = 0; i < x.length; i++)
		      x[i] = Integer.parseInt(ss[i]);
		    if (!f(x)) {
		      System.out.println(-1);
		    } else {
		      System.out.println(a + " " + b);
		    }
		  }

		  static int a;
		  static int b;

		  private static boolean f(int[] x) {
		    for (int i = 0; i < x.length - 1; i++) {
		      //i位置向后尝试每一个可走的位置
		      for (int j = x[i] + 1; j < x[i + 1]; j++) {
		        int old = x[i];//记录i位置的原始值
		        x[i] = j; //该表i位置的值
		        try {
		          //生成新的局面，如果这个局面判定对方输，那我们就赢了
		          if (!f(x)) {
		            a = old;
		            b = j;
		            return true;
		          }
		        } finally {
		          x[i] = old;// 恢复i位置的值，进行下一次尝试
		        }
		      }
		    }
		    //for循环无法进行，或者整个for循环走完都没有一次变动能造成对方输，就返回false
		    return false;
		  }
}
