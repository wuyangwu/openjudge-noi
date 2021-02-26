package b8.b20191223;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/4 19:52
 */
class Solution {
    public static boolean guess(long mid,long y) {
        return (long)mid * mid <= y;
    }
    public static int mySqrt(int x) {
        long L = 0;
        long R = x + 1L;
        long ans = 0;
        while(L < R) {
            long mid = (L + R) / 2;
            if(guess(mid,x)) {
                ans = mid;
                L = mid + 1;
            }
            else
                R = mid;
        }
        return (int)ans;
    }

    public static void main(String[] args){
        System.out.println(mySqrt(5));
    }
}