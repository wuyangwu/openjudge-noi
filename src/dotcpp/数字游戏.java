package dotcpp;

import java.util.Scanner;

public class 数字游戏 {
   // 我这个超时
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // 几个人
		int k = scanner.nextInt(); //
		int t = scanner.nextInt(); // 有几轮数字
		int[] number = new int[n+1];
		int sum = 0,count =0;
		number[n] = 1;
		for (int i = 1; i <=t; i++) {
			for(int j =1 ; j<=n;j++){
				if(j ==1){
					number[j] = (number[n]+count)%k;
					sum += number[j];
				}else {
					number[j] = (number[j-1]+count)%k;
				}
				count++;
			}
		}
		System.out.println(sum);
	}
}
