package dotcpp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/23 14:28
 */
class Wu implements Comparable<Wu>{
    double gi = 0.0; // 重量
    double pi = 0.0; // 价值
    double jiazhibi = 0.0;// 价值/重量
    Wu(double gi , double pi, double jiazhibi){
        this.gi = gi;
        this.pi = pi;
        this.jiazhibi = jiazhibi;
    }
	@Override
	public int compareTo(Wu o) {
		if ((this.jiazhibi- o.jiazhibi)>0) {
			return 1;
		}
		return -1;
	}
}
public class 快乐司机 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a ="1";
        int n = scanner.nextInt(); // 数量
        int w = scanner.nextInt(); // 核载重量
        Wu[] wus = new Wu[n];
        for (int i = 0; i < n; i++) {
        	double gi = scanner.nextDouble();
        	double pi = scanner.nextDouble();
        	wus[i] = new Wu(gi,pi,pi/gi);
		}
        Arrays.sort(wus,0,n,Collections.reverseOrder());
        double sum = 0;
        for(int i =0; i < n; i++) {
        	if (w>wus[i].gi) {
        		sum += wus[i].pi;
        		w -= wus[i].gi;
			}else {
				sum += wus[i].jiazhibi*w;
				break;
			}
        }
        System.out.println(String.format("%.1f", sum));
    }
}
