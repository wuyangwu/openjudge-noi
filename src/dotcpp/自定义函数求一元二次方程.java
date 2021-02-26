package dotcpp;

import java.util.Scanner;

public class 自定义函数求一元二次方程 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double c = scanner.nextInt();
		double d = b*b-4*a*c,x1,x2;
		if (d>0) {
			x1 = (-b+Math.sqrt(d))/2*a;
			x2 = (-b-Math.sqrt(d))/2*a;
			System.out.println(String.format("x1=%.3f", x1)+" "+String.format("x2=%.3f", x2));
		}
		if (d==0) {
			x1 =x2 = -b/(2*a);
			System.out.println(String.format("x1=%.3f", x1)+" "+String.format("x2=%.3f", x2));
		}
		if (d<0) {
			System.out.println(String.format("x1=%.3f+%.3fi",-b/(2*a),(Math.sqrt(-d))/(2*a))+" "+String.format("x2=%.3f-%.3fi",(-b)/(2*a),(Math.sqrt(-d))/(2*a)));
		}
	}

}
