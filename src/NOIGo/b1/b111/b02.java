package NOIGo.b1.b111;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/1/28 13:40
 */
public class b02 {

    static double zhi(double m){
        return (m*m*m*m*m)-(15*m*m*m*m)+(85*m*m*m)-(225*m*m)+(274*m)-121;
    }

    public static void main(String[] args){
        double x = 1.5, y = 2.4;
        double z = 0;
        while (x<=y){
            z = (x+y)/2;
            if (zhi(z)<1e-7&&zhi(z)>-1e-7){
                System.out.println(String.format("%.6f",z));
                break;
            }
                if (zhi(z)>0){
                    x= z;
                } else {
                    y = z;
                }
        }

    }
}
