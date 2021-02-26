package dotcpp;

import java.util.Scanner;

public class 完美的代价 {
	
	static boolean c = false;
	static int sum = 0;
	static int n = 0;
	
	static void pai(char s[] , int a , int b) {
		char temp = s[a];
		for (int i = a; i <b; i++) {
			s[i] = s[i+1];
		}
		s[b] = s[a];
	}
	
	static boolean sousuo(char s[] , int a , int b) {
		if (a>=b) {
			return true;
		}
		// 从后面往前扫描
		for (int i = b; i>a; i--) {
			if (s[a] == s[i]) {
				pai(s, i, b);
				sum += b-i;
				return sousuo(s, a+1, b-1);
			}
		}
		
		if (!c) {
			c = true;
			sum += n/2 -a;
		  return sousuo(s, a+1, b);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 n = scanner.nextInt();
		char[] s = scanner.next().toCharArray();
		if (sousuo(s, 0, n-1)) {
			System.out.println(sum);
		}else {
			System.out.println("Impossible");
		}
	}
}
