package dotcpp;

import java.io.BufferedInputStream;
import java.util.Calendar;
import java.util.Scanner;

public class 任意年月日历输出 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		Calendar calendar = Calendar.getInstance(); //
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("---------------------");
		System.out.println(" Su "+"Mo "+"Tu "+"We "+"Th "+"Fr "+"Sa");
		System.out.println("---------------------");
		int n = calendar.get(Calendar.DAY_OF_WEEK); // 获取您输入的这个星期第几天是1号;
		int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 可以获取你输入的月份有多少天
		int dayNu = 1;
		for (int i = 0; i <6; i++) {
			for (int j = 1; j <=7; j++) {
				if (i == 0) {
					if ( j>=n) {
						System.out.print("  "+(dayNu++));
					}else {
						System.out.print("   ");
					}	
				}else {
					if (dayNu>=10) {
						System.out.print(" "+(dayNu++));
					}else {
						System.out.print("  "+(dayNu++));
					}
				
				}
				if (dayNu > day) {
					System.out.println();
					System.out.println("---------------------");
					System.exit(0);
				}
				
			}
			System.out.println();
		}
	}
}
