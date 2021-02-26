package dotcpp;

import java.util.Arrays;
import java.util.Scanner;

public class Huffuman树 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] number = new int[n];
		int[] m = new int[n];
		for (int i = 0; i < n; i++) {
			number[i] = scanner.nextInt();
		}
		Arrays.sort(number,0,n);
		
		m[0] = number[0]+number[1];
		int sum = m[0], i =2,c=1,j=0,op1=0,op2=0;
		while (++c<n) {
			if (i<n&&number[i]<m[j]) {
				op1 = number[i++];
			}else {
				op1 = m[j++];
			}
			
			if (i<n&&number[i]<m[j]) {
				op2 = number[i++];
			}else {
				if (m[j]==0) {
					op2 = number[i++];
				}else {
					op2 = m[j++];
				}
			}
			m[c-1]= op1+op2;
			sum += m[c-1];
		}
		System.out.println(sum);
	}

}
