package dotcpp;

import java.util.Scanner;


public class 错误票据 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[][] numberStrings = new String[n][101];
		for (int i = 0; i < n; i++) {
			numberStrings[i] = scanner.nextLine().replaceAll("\\s+", " ").split(" ");
		}
		int[] ns = new int[100000];
		int count = 0;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <numberStrings[i].length; j++) {
				ns[Integer.valueOf(numberStrings[i][j])] += 1;
			}
		}
		while (ns[count]==0) {
			count++;
		}
		int k = 0 , m= 0, n1 =0;
		for (int i = count; i <100000; i++) {
			
			if (ns[i] == 0) {
			    k ++;
			    if (k==1) {
			    	m = i;
				}
			}
			if (ns[i]>1) {
				n1 = i;
			}
			if (k==2) {
				break;
			}
		}
		System.out.println(m+" "+n1);
	}

}
