package test;

import java.util.ArrayList;
import java.util.Calendar;

public class 测试Arrayist {

	public static void main(String[] args) {
		Calendar c= Calendar.getInstance();
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH,5);//注意一定要写5，不要写6！Calendar.MONTH是从0到11的！
		int n=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("2018年6月有"+n+"天");

//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		for (int i = 0; i <5; i++) {
//			arrayList.add(i);
//		}
	}

}
