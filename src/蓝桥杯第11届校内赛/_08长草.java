package 蓝桥杯第11届校内赛;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class _08长草 {
	
	static int[] dx = {1,-1,0,0};
	
	static int[] dy = {0,0,1,-1};
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		String[] nu = new String[n];
		String[] nus= new String[n];
		
		for (int i = 0; i < n; i++) {
			nu[i] = scanner.next();
			nus[i] = nu[i];
		}
		int k = scanner.nextInt();
		for (int i = 0; i <k; i++) {
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					if (nu[j].charAt(j2) == 'g') {
						for (int l = 0; l <4; l++) {
							int dxx = j + dx[l];
							int dyy = j2 + dy[l];
							if (dxx>=0&&dxx<=n-1&&dyy>=0&&dyy<=m-1) {
				                 // 修改字符串的值
                                StringBuilder sb = new StringBuilder(nus[dxx]);
                                sb.replace(dyy,dyy+1,"g");
                                nus[dxx] = sb.toString();
							}
						}
					}
				}
			}
			for (int j = 0; j < n; j++) {
				nu[j] = nus[j];
			}
			
		}
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 0; i < n; i++) {
			writer.write(nu[i]);
			writer.write('\n');
		}
		writer.flush();
	}

}
