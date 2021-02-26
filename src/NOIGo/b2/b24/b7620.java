package NOIGo.b2.b24;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/18 16:23 7620:区间合并
 */
class qujian implements Comparable<qujian>{
    int x,y;
    qujian(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(qujian o) {
        if (this.x == o.x){
            return this.y-o.y;
        }
        return this.x-o.x;
    }
}
public class b7620 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        qujian[] qujians = new qujian[n];
        for (int i = 0; i< n ;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            qujians[i] = new qujian(x,y);
        }
        Arrays.sort(qujians,0,n);
        int x =qujians[0].x, y = qujians[0].y;
        for (int i=1;i<n;i++){
            if (qujians[i].x>y){
                System.out.println("no");
                System.exit(0);
            }
            if (qujians[i].y>y) {
                y = qujians[i].y;
            }
        }
        System.out.println(x+" "+y);
    }
}
