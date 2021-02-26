package AlgorithmBasics.B20191211;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/14 15:16 二分法求平方根
 */
public class erfen {

    public static int erfen(int n){
        int l = 0;
        int r = n;
        int a=0;
        while (l<=r){
            int mid = l + (r - l)/2;
            if( mid * mid > n){
                r  = mid-1;
            }else {
                a = mid;
                l = mid+1;
            }
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(  erfen(4));
    }
}
