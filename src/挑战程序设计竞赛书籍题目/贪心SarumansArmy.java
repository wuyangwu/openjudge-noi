package 挑战程序设计竞赛书籍题目;

public class 贪心SarumansArmy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =6;
		int r = 10;
		int x[] = {1,7,15,20,30,50};
		int i = 0 ,ans = 0;
		while (i<n) {
			int a = x[i++];
			while (i<n&&x[i]<=a+r) {
				i++;
			}
			int b = x[i-1];
			while (i<n&&x[i]<=b+r) {
				i++;
			}
			ans++;
		}
		System.out.println(ans);
	}

}
