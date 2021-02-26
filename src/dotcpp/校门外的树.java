package dotcpp;

import java.util.Arrays;
import java.util.Scanner;


class Qu implements Comparable<Qu>{
	int x = 0;
	int y = 0;
	
	Qu(int x ,int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Qu o) {
		if (this.x == o.x) {
			return this.y - o.y;
		}
		return this.x-o.x;
	}
}
public class 校门外的树 {
   // 这个写法只对91%
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int m = scanner.nextInt();
		Qu[] qus = new Qu[m];
		for (int i = 0; i < m; i++) {
			qus[i] = new Qu(scanner.nextInt(), scanner.nextInt());
		}
		Arrays.sort(qus,0,m);
		int y = qus[0].y , x =qus[0].x, sum =0;
		for (int i = 1; i <m; i++) {
			if (qus[i].x<=y) {
				y = qus[i].y;
			}else {
				sum += y-x+1;
				x= qus[i].x;
				y = qus[i].y;
			}
		}
		sum += y-x+1;
		System.out.println(l+1-sum);
		
	}
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		a += 1;
//		int b = sc.nextInt();
//		int c, d;
//		int sum = 0;
//		int arr[] = new int[a];
//		for (int i = 0; i < a; i++)
//		arr[i] = 1;
//		for (int i = 0; i < b; i++) {
//		c = sc.nextInt();
//		d = sc.nextInt();
//		for (int x = 0; x < a; x++) {
//		if (x <= d && x >= c)
//		arr[x] = 0;
//		}
//		}
//		for (int x = 0; x < a; x++) {
//		if (arr[x] == 1)
//		sum++;
//		}
//		System.out.print(sum);
//		}

}
