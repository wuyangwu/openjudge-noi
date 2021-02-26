package 蓝桥杯真题._2013;

import java.util.Calendar;
import java.util.Scanner;

public  class _01世纪末的星期 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); 
		System.out.println(calendar.get(Calendar.YEAR)); // 可以获取当前年份
		System.out.println(calendar.get(Calendar.MONTH)); // 获取当前月份
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 获取当前是多少日
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));  // 获取当前是本周的周几，格式是 星期一是2 星期天是1依次类推		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));  // 获取当前日在本年里面是多少天
		// 用来获取每个世纪的 12月31号是星期几，如果是星期一就break
		for(int year = 2010; year < 10000; year += 100) {
			calendar.set(Calendar.YEAR, year);
			calendar.set(Calendar.MONTH, 8);
			calendar.set(calendar.DAY_OF_MONTH, 1);
			System.out.println(year+" "+calendar.get(Calendar.DAY_OF_WEEK));
			if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
				break;
			}
		}
		
	}
}
