package 算法很美蓝桥学院;

import java.util.Scanner;

public class kmp {
	
	
	static int[] nexts(String b) {
		int[] next = new int[b.length()];
		int i = -1;
		next[0] = -1;
		for (int j = 1; j < b.length(); j++) {
			while (i>-1&&b.charAt(i+1)!=b.charAt(j)) {
				  i  =next[i];
			}
			if (b.charAt(i+1) == b.charAt(j) ) {
				i++;
			}
			next[j] = i; 
		}
		return next;
	}

	// a位主串，b位子串
	static int kmps(String a, String b) {
		int[] next = nexts(b);
		int k = -1 , j = 0;
		for (int i = 0; i < a.length(); i++) {
			while (k>-1&&a.charAt(i) != b.charAt(k+1)) {
				k = next[k];
			}
			if (a.charAt(i) == b.charAt(k+1)) {
				k++;
			}
			if (k == b.length()-1) {
//				说明已经ok了一次
			  return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String aString = scanner.next();
		String bString = scanner.next();
		System.out.println(kmps(aString,bString));
	}

}
