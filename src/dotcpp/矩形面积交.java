package dotcpp;

import java.util.Scanner;


class juxing{
	double x =0;
	double y =0;
    juxing(double x, double y) {
    	this.x = x;
    	this.y = y;
	}
}
public class 矩形面积交 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		juxing[] juxings = new juxing[4];
		for (int i = 0; i < 4; i++) {
			juxings[i] = new juxing(scanner.nextDouble(), scanner.nextDouble());
		}
		
		double x2 = Math.max(Math.min(juxings[0].x, juxings[1].x), Math.min(juxings[2].x, juxings[3].x));
		double x1 = Math.min(Math.max(juxings[0].x, juxings[1].x), Math.max(juxings[2].x, juxings[3].x));
		
		double y2 = Math.max(Math.min(juxings[0].y, juxings[1].y), Math.min(juxings[2].y, juxings[3].y));
		double y1 = Math.min(Math.max(juxings[0].y, juxings[1].y), Math.max(juxings[2].y, juxings[3].y));
		
		if (x1>x2&&y1>y2) {
			System.out.println(String.format("%.2f",(x1-x2)*(y1-y2)));
		}else {
			System.out.println(String.format("%.2f",0.00));
		}
		
	}
}
