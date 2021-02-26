package 挑战程序设计竞赛书籍题目;

import java.util.Arrays;
import java.util.Collections;

class QuJian implements Comparable<QuJian>{
	int x,y;
	public QuJian(int x, int y) {
		this.x =x;
		this.y = y;
	}
	
	@Override
	public int compareTo(QuJian a) {
		return this.y-a.y;
	}
}
public class 贪心区间调度 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int s[] = {6,8,4,1,2};
		int t[] = {9,10,7,3,5};
		QuJian[] num = new QuJian[n];
		for (int i = 0; i < n; i++) {
			num[i] = new QuJian(s[i],t[i]);
		}
		Arrays.sort(num,0,n);
		int b = num[0].y, ans = 1;
		for (int i = 1; i <n; i++) {
			if (num[i].x>b) {
				b = num[i].y;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
