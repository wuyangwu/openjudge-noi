package test;

import java.util.Arrays;
import java.util.Collections;

class Paixu implements Comparable<Paixu>{
	int a,b;
	Paixu(int a , int b){
		this.a = a;
		this.b = b;
	}
	@Override
	public int compareTo(Paixu o) {
		if(this.a==o.a) {
			return 0;
		}
		return this.a-o.a;
//		return this.a-o.a;
	}
	
}
public class 稳定排序测试 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paixu[] paixus = new Paixu[6];
		paixus[0] = new Paixu(3, 1);
		paixus[1] = new Paixu(1, 1);
		paixus[2] = new Paixu(5, 1);
		paixus[3] = new Paixu(1,2);
		paixus[4] = new Paixu(5,3);
		paixus[5] = new Paixu(3,2);
//		Collections.sort(paixus,0,6);
		Arrays.sort(paixus,0,6);
		System.out.println();
	}

}
