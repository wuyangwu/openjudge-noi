package 算法很美蓝桥学院;

import java.util.Scanner;

public class 天平称重问题 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//
		int count = 0;
		int[] num = new int[n];
		while (n != 0) {
			num[count++] = n % 3;
			n /= 3;
		}

		for (int i = 0; i <= count - 1; i++) {
			if (num[i] == 2) {
				num[i] = -1;
				num[i + 1] += 1;
			}
		}
		
		  for(int i = count ; i>=0; i--) { 
			  if(num[i]==1) {
				  System.out.print("+"+num[i]*(int)Math.pow(3, i));
			  }else {
				  if(num[i] == -1) {
					  System.out.print(num[i]*(int)Math.pow(3, i));
				  }
			  }
		  }
		
	}
}
