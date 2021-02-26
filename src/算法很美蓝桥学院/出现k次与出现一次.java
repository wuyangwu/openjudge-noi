package 算法很美蓝桥学院;

public class 出现k次与出现一次 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,2,8,2,7,3,7,3,7,3,10,10,10,100,100,100,0,0,0,12139999,12139999,12139999};
		int k =3;
		char[][] aStrings = new char[a.length][];
		int maxlen =0;
		for (int  i =0;i<a.length; i++) {
			aStrings[i] = Integer.toString(a[i],k).toCharArray();
			if (aStrings[i].length>maxlen) {
				maxlen  = aStrings[i].length;
			}
		}
		int[] b = new int[a.length]; // 用来存入运算结果按位来加
		for (int i = 0; i <a.length; i++) {
			for (int j= aStrings[i].length-1;j>=0;j--) {
				b[j] += aStrings[i][j] - '0'; 
				if (b[j] >= k) {  //如果大于等于k说明要进位了则进行不进位加法，把进位去掉也就-k
					b[j] -= k;
				}
			}
		}
		int ans=0;
		for (int i = 0; i < b.length; i++) {
			ans += b[i]*Math.pow(k, i); // 把k进制转换成10进制
		}
		System.out.println(ans);
	}

}
