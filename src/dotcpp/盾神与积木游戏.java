package dotcpp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/22 15:49
 */
class Jimu implements Comparable<Jimu>{
    int have = 0; // 有多少积木
    int need = 0; //  需要多少积木
    int sum = 0;  // 有的减去需要的 大于等于0就是正好 小于0就是不够
    Jimu(int have, int need ,int sum){
        this.have = have;
        this.need = need;
        this.sum = sum;
    }
    @Override
    public int compareTo(Jimu o) {
        return this.sum-o.sum;
    }
}
public class 盾神与积木游戏 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        for (int k =0; k <m ;k++){
            int n = scanner.nextInt();
            Jimu[] jimus = new Jimu[n];
            for (int i =0 ;i < n; i++){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                jimus[i] = new Jimu(x,y,x-y);
            }
            Arrays.sort(jimus,0,n, Collections.reverseOrder());
            int sum = 0;
            int c = 0;
            for (int i =0 ; i< n ;i++){
                if (jimus[i].have+sum>=jimus[i].need){
                    sum += jimus[i].have;
                }else {
                    c = 1;
                    break;
                }
            }
            if (c==1){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
