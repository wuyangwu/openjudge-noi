package dotcpp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Jiug{
	int x =0 , y = 0;
	int count =0;
	String b;
	public Jiug(int x, int y, int count,String b) {
		this.x = x;
		this.y = y;
		this.count = count;
		this.b = b;
	}
}
public class 九宫重排 {
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	
	// 传入的字符串，要移动的.的位置和需要交换的数据的位置
	static String yidong(String b, int x,int y,int bx,int by){
		char[][] a = new char[3][3];
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = b.charAt(k++);
			}
		}
		char c = a[x][y];
		a[x][y] = a[bx][by];
		a[bx][by] = c;
		String aString = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				aString += a[i][j];
			}
		}
		return aString;
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String aString = scanner.next(); //第一张图 最后的结果图
		String bString = scanner.next(); // 第二张图
		char[][] a = new char[3][3];
		char[][] b = new char[3][3];
		int ax = 0, ay=0, bx=0,by=0,k=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = aString.charAt(k);
				b[i][j] = bString.charAt(k);
				if (a[i][j] == '.') {
					ax = i; ay=j;
				}
				if (b[i][j] == '.') {
					bx = i; by = j;
				}
				k++;
			}
		}
		Queue<Jiug> queuesJiugs = new LinkedList<Jiug>();
		queuesJiugs.add(new Jiug(bx, by, 0,bString));
		while (!queuesJiugs.isEmpty()) {
			Jiug jiug = queuesJiugs.peek();// 只读不拿
			if (jiug.b.equals(aString)){
				System.out.print(jiug.count);
				System.exit(0);
			}
			// 上下左右试一下
			for (int i = 0; i < 4; i++) {
				int dxx = jiug.x + dx[i];
				int dyy = jiug.y + dy[i];
				if (dxx>=0&&dxx<=2&&dyy>=0&&dyy<=2) {
					// 按照输入的开始移动
					queuesJiugs.add(new Jiug(dxx, dyy, jiug.count+1,yidong(jiug.b, jiug.x, jiug.y, dxx, dyy)));
				}
			}
			queuesJiugs.poll();
		}
		System.out.print("-1");
		
	}

}
