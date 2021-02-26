package AlgorithmBasics.B20191211;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/11 22:34 1 2 3 5 8 13  21
 */
public class tuzi {

    public static void main(String[] args){
        int c = 6, sum=0,a =1 ,b =2;
        for(int i=3;i<=c;i++)
        {
            sum = a+b;
            a=b;
            b=sum;
        }
        System.out.println(sum);
    }
}
