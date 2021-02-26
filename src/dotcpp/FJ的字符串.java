package dotcpp;

import java.util.Scanner;

public class FJ的字符串 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		char a = 'A';
		String bString  =  "A" ,bString2 = "";
		for (int i = 2; i <=n; i++) {
			   a += 1;
			   bString = String.format("%S%S%S", bString,a,bString);
		}
		System.out.println(bString);
	}

}
