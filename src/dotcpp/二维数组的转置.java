package dotcpp;

import java.util.Scanner;

public class 二维数组的转置 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[][] number = new int[3][3];
		for(int i = 0; i<3; i++) {
			for(int j = 0; j< 3; j++) {
				number[i][j] = scanner.nextInt();
			}
		}
		for(int i = 0; i<3; i++) {
			for(int j = 0; j< 3; j++) {
				System.out.print(number[j][i]+" ");
			}
			System.out.println();
		}
	}

}
