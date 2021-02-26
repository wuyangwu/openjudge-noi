package dotcpp;

import java.util.Calendar;

public class 高斯日记 {
	public static void main(String[] args) {
		// 1970年之前不行
		Calendar calendar  = Calendar.getInstance(); 
		for (int i = 1999; i < 2000; i++) {
			calendar.set(Calendar.YEAR, i);
			calendar.set(Calendar.MONTH,11);
			calendar.set(Calendar.DAY_OF_MONTH,31);
			System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		}
	}
}
