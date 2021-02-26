package 蓝桥杯第11届校内赛;

import java.util.Scanner;

public class _07音节判断 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nuString  = scanner.next();
		int i = 0;
		int j = 0;
		while (i<nuString.length()) {
			if (nuString.charAt(i)=='a'||nuString.charAt(i)=='e'||nuString.charAt(i)=='i'||nuString.charAt(i)=='o'||nuString.charAt(i)=='u') {
				break;
			}
			while (i<nuString.length()&&(nuString.charAt(i)!='a'&&nuString.charAt(i)!='e'&&nuString.charAt(i)!='i'&&nuString.charAt(i)!='o'&&nuString.charAt(i)!='u')) {
				i++;
			}
			j++;
			if (i == nuString.length()) {
				break;
			}
		
			while (i<nuString.length()&&(nuString.charAt(i)=='a'||nuString.charAt(i)=='e'||nuString.charAt(i)=='i'||nuString.charAt(i)=='o'||nuString.charAt(i)=='u')) {
				i++;
			}
			j++;
		}
		if (j == 4) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
