package AlgorithmBasics.b20200211;

import java.util.Arrays;

/**
 * @author wuyang
 * @version 1.0
 * @date 2020/2/11 20:19 圣诞老人的礼物
 */
class Liwu implements Comparable<Liwu>{
    double v;  // 价格
    double w;  // 重量
    public Liwu(double v, double w){
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(Liwu o) {
        if ((this.v/this.w-o.v/o.w)>0){
            return 1;
        }
        return -1;
    }
}
public class b1 {
    public static void main(String[] args){
        Liwu[]  liwus = new Liwu[4];
        liwus[0] = new Liwu(100.0,10.0);
        liwus[1] = new Liwu(50.0,1.0);
        liwus[2] = new Liwu(30.0,7.0);
        liwus[3] = new Liwu(120.0,10.0);
        Arrays.sort(liwus,0,4);
        System.out.println();
    }
}
