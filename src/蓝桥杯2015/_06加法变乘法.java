package 蓝桥杯2015;

public class _06加法变乘法 {
	public static void main(String[] args) {
		for(int i = 1; i<=48;i++) {
			for (int j = i+2; j <=48; j++) {
				int s = 1225 -2*i-1-2*j-1;
				if ((s+i*(i+1)+j*(j+1))==2015) {
					System.out.println(i+" "+(i+1)+"  "+j+" "+(j+1));
				}
			}
		}
	}
}
