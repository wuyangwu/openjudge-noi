package dotcpp;

import java.util.Scanner;

public class 蚂蚁感冒 {
   //  能对40%
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] number = new int[n];
		for (int i = 0; i <n; i++) {
			number[i] = scanner.nextInt();
		}
		int a = number[0] , sum = 1, c= 0;
		boolean b =false;
		for(int i = 1 ; i< n;i++) {
			if (a >0) { // 第一个数据大于0
				if (a>Math.abs(number[i])&&number[i]<0) { // 第一个蚂蚁向右走，如果右边向左走都会被感染
					 b = true;
					 sum++;
				}
				if (Math.abs(number[i])>a&&number[i]>0) { //第一个蚂蚁向右走，则左边向右走的蚂蚁都不会被感染，如果右边出现一个向左走的蚂蚁则都会被感染
					c++;
				}
			}
			if (a<0) {// 第一个数据小于0
				if (Math.abs(a)>Math.abs(number[i])&&number[i]>0) { // 如果第一个蚂蚁向左走，则左边向右走的蚂蚁都会被感染
					 b = true;
					 sum++;
				}
				if (Math.abs(number[i])>Math.abs(a)&&number[i]<0) { // 第一个蚂蚁向左走，如果右边向左走的蚂蚁都不会感染如果 b=ture说明左边出现向右的蚂蚁则右边都会被感染
					c++;
				}
			}
		}
		
		sum = b==true? sum+c:sum;
		System.out.println(sum);
		scanner.close();
		
	}

}
