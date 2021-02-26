package dotcpp;

import java.util.Arrays;
import java.util.Scanner;

public class Huffuman树_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nu = new int[n];
		int[] nus = new int[n];
		for (int i = 0; i < n; i++) {
			nu[i] = scanner.nextInt();
		}
		Arrays.sort(nu, 0, n);
		nus[0] = nu[0]+nu[1];
		int i =2,j=0,op1=0,op2=0,c=1,sum = nus[0];
		while (c<n-1) {
			if (i<n&&nu[i]<nus[j]) {
				op1 =nu[i++];
			}else {
				op1 = nus[j++];
			}
			
			if (i<n&&nu[i]<nus[j]) {
				op2 = nu[i++];
			}else {
				if (nus[j] == 0) {
					op2 = nu[i++];
				}else {
					op2 = nus[j++];
				}
			}
			nus[c++] = op1+op2;
			sum += nus[c-1];
		}
		System.out.println(sum);
	}

}
